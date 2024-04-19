package it.gestoreattivita.bff.v1.attivita.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageAttivitaResponseDto implements Serializable {

    Integer numPages;

}
