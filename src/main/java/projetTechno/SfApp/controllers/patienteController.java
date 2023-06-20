package projetTechno.SfApp.controllers;

import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import projetTechno.SfApp.models.dtos.PatienteDTO;
import projetTechno.SfApp.models.entities.Patiente;
import projetTechno.SfApp.models.forms.PatienteAddForm;
import projetTechno.SfApp.services.patiente.patienteService;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("patiente")
public class patienteController {

    private final patienteService patienteService;


    public patienteController(projetTechno.SfApp.services.patiente.patienteService patienteService) {
        this.patienteService = patienteService;
    }

    @GetMapping("")
    public ResponseEntity<List<PatienteDTO>> getAllAction(
            Pageable pageable
    ) {
        List<PatienteDTO> patientes = this.patienteService.readAll(pageable).map(PatienteDTO::toDTO).toList();
        return ResponseEntity.ok(patientes);
    }

    @PostMapping("/add")
    public Patiente addPatiente(@RequestBody Patiente patiente) {
        return patienteService.addPatiente(patiente);
    }

    @GetMapping("/test")
    public String testEndpoint() {
        return "Endpoint test successful";
    }


}
