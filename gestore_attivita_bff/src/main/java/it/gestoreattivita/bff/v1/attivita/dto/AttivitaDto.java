package it.gestoreattivita.bff.v1.attivita.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttivitaDto implements Serializable {
    private Long id;
    private String alias;
    private Long attivitaPadre;
    private Boolean lavorata;
}
