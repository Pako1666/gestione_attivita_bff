package it.gestoreattivita.bff.util.paginator.impl;

import it.gestoreattivita.bff.rs.GestioneAttivitaRestService;
import it.gestoreattivita.bff.rs.dto.attivita.AttivitaResponseDto;
import it.gestoreattivita.bff.util.cache.CacheKeys;
import it.gestoreattivita.bff.util.cache.config.CacheConfig;
import it.gestoreattivita.bff.util.mock.MockDataService;
import it.gestoreattivita.bff.util.paginator.AbstractPaginatorService;
import it.gestoreattivita.bff.util.paginator.model.PageModel;
import it.gestoreattivita.bff.v1.attivita.dto.AttivitaDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AttivitaPaginator extends AbstractPaginatorService<AttivitaDto> {




//@Value("${bff.service.destinationServer}")
    private String host = "http://172.168.1.3:8080";


    //private RestTemplate restTemplate;

    @Autowired
    private RedisTemplate<String, Serializable> redisTemplate;

    @Override
    public void fetchElements() {
        log.info("prelevazione dati");
//        List<AttivitaResponseDto> restRes = restTemplate.exchange(
//                host+"/v1/attivita-api/all-attivita/",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<AttivitaResponseDto>>() {}
//
//        ).getBody();
//
//        List<AttivitaDto> datas = restRes.stream().map(
//                x -> AttivitaDto
//                        .builder()
//                        .id(x.getId())
//                        .attivitaPadre(x.getAttivitaPadre())
//                        .alias(x.getAlias())
//                        .lavorata(x.getLavorata())
//                        .build()
//        ).toList();

        List<AttivitaDto> datas = new ArrayList<>();
        List<PageModel<AttivitaDto>> pages = new ArrayList<>();
        log.info("paginazione");
        //PAGINAZIONE
        int indx = 0;
        for(int i = 0; i<datas.size();i+=3){

            PageModel<AttivitaDto> page = new PageModel<>();
            page.setIndex(indx);
            List<AttivitaDto> temps;
            if(i+3<datas.size())
                temps = datas.subList(i,i+3);

            else {
                temps = datas.subList(i, datas.size());
            }
            page.setItems(new ArrayList<>(temps));
            indx++;
            page.setIndex(indx);
            pages.add(page);


        }
        log.info("inserimento in cache");

        //cacheService.insert(CacheKeys.ATTIVITA_PAGES.name(),pages);
        redisTemplate.opsForValue().set("ciao","ciao");
    }

    @Override
    public  PageModel<AttivitaDto> getPage(int indxPage) {
/*
        if(cacheService.get(CacheKeys.ATTIVITA_PAGES.name())==null) {
            log.info("cache scaduta");
            fetchElements();
        }
        log.info("preleviamo dalla cache");
        List<PageModel<AttivitaDto>> pages = cacheService.get(CacheKeys.ATTIVITA_PAGES.name());

*/

        PageModel<AttivitaDto> page = new PageModel<>();
                //indxPage<pages.size()? pages.get(indxPage): pages.get(pages.size()-1);
        return page;
    }


}
