package it.gestoreattivita.bff.v1.attivita.service;

import it.gestoreattivita.bff.util.paginator.dto.PageDto;
import it.gestoreattivita.bff.v1.attivita.dto.AttivitaDto;

import java.util.List;

public interface AttivitaService {

   List<PageDto<AttivitaDto>> getAttivita();


}
