package it.gestoreattivita.bff.util.paginator.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageModel<T extends Serializable> implements Serializable {

    private Integer index;
    private List<T> items;

}
