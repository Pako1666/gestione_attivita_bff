package it.gestoreattivita.bff.v1.attivita.service.impl;

import it.gestoreattivita.bff.util.cache.CacheKeys;
import it.gestoreattivita.bff.util.cache.CacheService;
import it.gestoreattivita.bff.util.paginator.dto.PageDto;
import it.gestoreattivita.bff.util.paginator.impl.AttivitaPaginator;
import it.gestoreattivita.bff.util.paginator.model.PageModel;
import it.gestoreattivita.bff.v1.attivita.dto.AttivitaDto;
import it.gestoreattivita.bff.v1.attivita.dto.DetailAttivitaDto;
import it.gestoreattivita.bff.v1.attivita.dto.PageAttivitaResponseDto;
import it.gestoreattivita.bff.v1.attivita.service.AttivitaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AttivitaServiceImpl implements AttivitaService {

    @Autowired
    private AttivitaPaginator attivitaPaginator;

    @Autowired
    private CacheService cacheService;

    @Override
    public PageAttivitaResponseDto init() {
        attivitaPaginator.fetchElements();
        List<PageModel<AttivitaDto>> list = cacheService.get(CacheKeys.ATTIVITA_PAGES.name());
        PageAttivitaResponseDto dto = new PageAttivitaResponseDto();
        dto.setNumPages(list.size());
        return dto;
    }

    @Override
    public PageDto<AttivitaDto> getPage(Long index) {
        PageModel<AttivitaDto> pageModel = attivitaPaginator.getPage(index.intValue());
        PageDto<AttivitaDto> pageDto = new PageDto<>();
        pageDto.setIndex(index.intValue());
        pageDto.setItems(pageModel.getItems());
        return pageDto;
    }

    @Override
    public DetailAttivitaDto getDetail(Long attIndex) {
        return null;
    }
}
