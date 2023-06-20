package projetTechno.SfApp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetTechno.SfApp.models.dtos.AdresseDTO;
import projetTechno.SfApp.services.adresse.adresseService;
import org.springframework.data.domain.Pageable;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("adresse")
public class adresseController {
    private final adresseService adresseService;


    public adresseController(adresseService adresseService) {
        this.adresseService = adresseService;
    }

    @GetMapping("")
    public ResponseEntity<List<AdresseDTO>> getAllAction(
            Pageable pageable
    ) {
        List<AdresseDTO> adresses = this.adresseService.readAll(pageable).map(AdresseDTO::toDTO).toList();
        return ResponseEntity.ok(adresses);
    }

}