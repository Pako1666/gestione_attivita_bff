package it.gestoreattivita.bff.util.paginator;

import it.gestoreattivita.bff.util.cache.CacheService;
import it.gestoreattivita.bff.util.paginator.model.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


public abstract class AbstractPaginatorService<T extends Serializable> {

    protected int itemsMaxPerPag = 3;
    protected int pagesNumber;
    /*@Autowired
    protected CacheService cacheService;*/

    /**
     *
     * funzionalità paginator:
     *      - recupera gli elementi
     *      - li partiziona
     *      - mostra quelli correnti
     * */

    public abstract void fetchElements();

    public abstract PageModel<T> getPage(int indxPage);

}
