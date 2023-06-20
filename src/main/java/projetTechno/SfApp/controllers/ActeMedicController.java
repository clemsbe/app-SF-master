package projetTechno.SfApp.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetTechno.SfApp.models.dtos.ActeMedicDTO;
import projetTechno.SfApp.models.entities.ActeMedic;
import projetTechno.SfApp.services.acteMedic.ActeMedicService;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/acteMedical")
public class ActeMedicController {

    private final ActeMedicService acteMedicService;


    public ActeMedicController(ActeMedicService acteMedicService) {

        this.acteMedicService = acteMedicService;
    }

    @GetMapping("")
    public ResponseEntity<List<ActeMedicDTO>> getAllAction(Pageable pageable) {
        List<ActeMedic> acteMedics = acteMedicService.getAllActeMedics();
        List<ActeMedicDTO> acteMedicDTOs = acteMedics.stream().map(ActeMedicDTO::toDTO).toList();
        return ResponseEntity.ok(acteMedicDTOs);
    }
}

