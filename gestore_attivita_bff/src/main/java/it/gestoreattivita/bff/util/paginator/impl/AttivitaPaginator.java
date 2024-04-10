package it.gestoreattivita.bff.util.paginator.impl;

import it.gestoreattivita.bff.util.cache.CacheKeys;
import it.gestoreattivita.bff.util.paginator.AbstractPaginatorService;
import it.gestoreattivita.bff.util.paginator.dto.PageDto;
import it.gestoreattivita.bff.util.paginator.model.PageModel;
import it.gestoreattivita.bff.v1.attivita.dto.AttivitaDto;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Service
public class AttivitaPaginator extends AbstractPaginatorService<AttivitaDto> {




    @Override
    public void fetchElements() {
        List<AttivitaDto> datas = new ArrayList<>();

        for(int i = 0;i<9;i++){
            Long id = (long) i;

            datas.add(
                    new AttivitaDto(id,"a"+i,id==0?null:id-1,false)
            );
        }

        List<PageModel<AttivitaDto>> pages = new ArrayList<>();
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

        cacheService.insert(CacheKeys.ATTIVITA_PAGES.name(),pages);
    }

    @Override
    public  PageModel<AttivitaDto> getPage(int indxPage) {
        if(cacheService.get(CacheKeys.ATTIVITA_PAGES.name())==null)
            fetchElements();

        List<PageModel<AttivitaDto>> pages = cacheService.get(CacheKeys.ATTIVITA_PAGES.name());

        PageModel<AttivitaDto> page = indxPage<pages.size()? pages.get(indxPage): pages.get(pages.size()-1);
        return page;
    }


}
