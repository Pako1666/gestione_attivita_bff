package it.gestoreattivita.bff.v1.attivita.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttivitaModel implements Serializable {
    private Long id;
    private String alias;
    private Long attivitaPadre;
    private Boolean lavorata;
}
