package it.gestoreattivita.bff.v1.attivita;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.gestoreattivita.bff.util.paginator.dto.PageDto;
import it.gestoreattivita.bff.v1.attivita.dto.AttivitaDto;
import it.gestoreattivita.bff.v1.attivita.dto.PageAttivitaResponseDto;
import it.gestoreattivita.bff.v1.attivita.service.AttivitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/attività/")
@Tag(name = "Attività")
public class AttivitaController {

    @Autowired
    private AttivitaService attivitaService;


    @Operation(operationId = "initAttivitaPages", summary = "inizializza il paginator delle attività")
    @GetMapping("init/")
    public ResponseEntity<PageAttivitaResponseDto> init(){

        return ResponseEntity.ok().body(attivitaService.init());

    }

    @Operation(operationId = "getAttivitaPage", summary = "ottieni la pagina del paginator")
    @GetMapping("init/{index}")
    public ResponseEntity<PageDto<AttivitaDto>> getPage(@PathVariable("index") Long i){
        return ResponseEntity.ok().body(attivitaService.getPage(i.longValue()));
    }
}
