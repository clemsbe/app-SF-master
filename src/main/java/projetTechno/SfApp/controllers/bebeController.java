package projetTechno.SfApp.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetTechno.SfApp.models.dtos.BebeDTO;
import projetTechno.SfApp.services.bebe.bebeService;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/bebe")
public class bebeController {

    private final bebeService bebeService;

    public bebeController(bebeService bebeService) {
        this.bebeService = bebeService;
    }

    @GetMapping("")
    public ResponseEntity<List<BebeDTO>> getAllAction(
            Pageable pageable
    ){
        List<BebeDTO> bebes = this.bebeService.readAll(pageable).map(BebeDTO:: toDTO).toList();
        return ResponseEntity.ok(bebes);
    }

}