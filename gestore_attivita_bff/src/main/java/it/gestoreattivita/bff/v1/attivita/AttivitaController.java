package it.gestoreattivita.bff.v1.attivita;

import it.gestoreattivita.bff.util.cache.CacheKeys;
import it.gestoreattivita.bff.util.cache.CacheService;
import it.gestoreattivita.bff.util.paginator.impl.AttivitaPaginator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("v1/attività")
public class AttivitaController {

    @Autowired
    CacheService cacheService;

    @Autowired
    AttivitaPaginator attivitaPaginator;


    public void prova(@PathVariable("indx") Integer i){

        System.out.println(attivitaPaginator.getPage(i.intValue()));

    }
}
