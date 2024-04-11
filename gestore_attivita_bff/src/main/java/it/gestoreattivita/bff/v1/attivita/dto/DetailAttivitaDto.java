package it.gestoreattivita.bff.v1.attivita.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetailAttivitaDto {
    private Long id;
    private String alias;
    private Long attivitaPadre;
    private Boolean lavorata;
}
