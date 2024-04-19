package it.gestoreattivita.bff.v1.attivita.service.impl;

import it.gestoreattivita.bff.rs.dto.attivita.AttivitaResponseDto;
import it.gestoreattivita.bff.rs.dto.attivita.PageAttivitaDto;
import it.gestoreattivita.bff.rs.dto.attivita.PaginatorResponseDto;
import it.gestoreattivita.bff.util.cache.CacheKeys;
import it.gestoreattivita.bff.util.cache.CacheService;
import it.gestoreattivita.bff.util.paginator.dto.PageDto;
import it.gestoreattivita.bff.util.paginator.impl.AttivitaPaginator;
import it.gestoreattivita.bff.util.paginator.model.PageModel;
import it.gestoreattivita.bff.v1.attivita.dto.AttivitaDto;
import it.gestoreattivita.bff.v1.attivita.dto.DetailAttivitaDto;
import it.gestoreattivita.bff.v1.attivita.dto.PageAttivitaResponseDto;
import it.gestoreattivita.bff.v1.attivita.model.AttivitaModel;
import it.gestoreattivita.bff.v1.attivita.service.AttivitaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AttivitaServiceImpl implements AttivitaService {

    @Autowired
    private CacheService cacheService;


    private RestTemplate restTemplate = new RestTemplate();

    private final String API_HOST = "http://172.168.1.3:8080";

    private final Integer NUM_ITMES_X_PAGE = 3;


    @Override
    public PageAttivitaResponseDto init() {
        /**
         *
         * 1) si controlla che nella cache ci sia la liste delle pagine
         * 2) se non è settata si inizializza e si salva in cache
         * 3) se */
        PageAttivitaResponseDto dto = new PageAttivitaResponseDto();

        if(cacheService.get(CacheKeys.ATTIVITA_PAGES.name())==null){
            log.info("inizializzazione lista in cache");
            List<PageModel<AttivitaModel>> attivita = new ArrayList<>();
            cacheService.insert(CacheKeys.ATTIVITA_PAGES.name(), (Serializable) attivita);
            log.info("lista salvata in cache");
        }

        if(cacheService.get(CacheKeys.INIT_PAGE.name())!=null){
            log.info("preleviamo il dto dalla cache");
            dto = (PageAttivitaResponseDto) cacheService.get(CacheKeys.INIT_PAGE.name());
        }
        else{
            log.info("preleviamo il dto dal servizio");
            //tutta la logica per recuperare il numero di pagine
            PaginatorResponseDto paginatorResponse = restTemplate
                    .getForEntity( API_HOST+"/v1/attivita-api/pages-info/"+this.NUM_ITMES_X_PAGE, PaginatorResponseDto.class)
                    .getBody();
            dto.setNumPages(paginatorResponse.getTotalPages());
            dto.setNumPages(paginatorResponse.getTotalPages());

            cacheService.insert(CacheKeys.INIT_PAGE.name(), dto);
        }
        return dto;
    }

    @Override
    public PageDto<AttivitaDto> getPage(Long index) {
        return null;
    }

    @Override
    public DetailAttivitaDto getDetail(Long attIndex) {
        return null;
    }
}
