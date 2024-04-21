package it.gestoreattivita.bff.rs.dto.attivita;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageAttivitaDto{
  private Integer page;
  private Integer items;
}