package projetTechno.SfApp.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetTechno.SfApp.models.dtos.ActeSfDTO;
import projetTechno.SfApp.services.acteSf.acteSfService;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/acteSageFemme")
public class acteSfController {

    private final acteSfService acteSfService;


    public acteSfController(acteSfService acteSfService) {

        this.acteSfService = acteSfService;
    }
    @GetMapping("")
    public ResponseEntity<List<ActeSfDTO>> getAllAction(
            Pageable pageable
    ){
        List<ActeSfDTO> acteSfs = this.acteSfService.readAll(pageable).map(ActeSfDTO:: toDTO).toList();
        return ResponseEntity.ok(acteSfs);
    }
}
