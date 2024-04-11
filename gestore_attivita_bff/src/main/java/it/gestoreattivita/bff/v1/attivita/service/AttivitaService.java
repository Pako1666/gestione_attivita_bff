package it.gestoreattivita.bff.v1.attivita.service;

import it.gestoreattivita.bff.util.paginator.dto.PageDto;
import it.gestoreattivita.bff.v1.attivita.dto.AttivitaDto;
import it.gestoreattivita.bff.v1.attivita.dto.DetailAttivitaDto;
import it.gestoreattivita.bff.v1.attivita.dto.PageAttivitaResponseDto;

import java.util.List;

public interface AttivitaService {

   PageAttivitaResponseDto init();
   PageDto<AttivitaDto> getPage(Long index);
   DetailAttivitaDto getDetail(Long attIndex);


}
