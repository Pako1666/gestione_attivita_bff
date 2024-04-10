package it.gestoreattivita.bff.v1.attivita.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttivitaModel {
    private Long id;
    private String alias;
    private Long attivitaPadre;
    private Boolean lavorata;
}
