package it.gestoreattivita.bff.util.paginator.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data

public class PageDto<T extends Serializable>{
    private Integer index;
    private List<T> items;
}
