package it.gestoreattivita.bff.util.paginator;

import it.gestoreattivita.bff.util.paginator.model.PageModel;

import java.io.Serializable;


public abstract class AbstractPaginatorService<T extends Serializable> {

    protected int itemsMaxPerPag = 3;
    protected int pagesNumber;

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
