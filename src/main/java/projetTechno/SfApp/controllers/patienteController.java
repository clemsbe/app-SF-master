package projetTechno.SfApp.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetTechno.SfApp.models.dtos.PatienteDTO;
import projetTechno.SfApp.models.entities.Patiente;
import projetTechno.SfApp.services.patiente.PatienteService;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/patiente")
public class patienteController {

    private final PatienteService patienteService;


    public patienteController(PatienteService patienteService) {
        this.patienteService = patienteService;
    }

    @GetMapping("/ListPatiente")
    public ResponseEntity<List<PatienteDTO>> getAllAction(
            Pageable pageable) {
        List<Patiente> listpatientes = patienteService.getAllPatiente();
        List<PatienteDTO> patienteDTOs = listpatientes.stream().map(PatienteDTO::toDTO).toList();
        return ResponseEntity.ok(patienteDTOs);
    }

    @PostMapping("/add")
    public Patiente addPatiente(@RequestBody Patiente patiente) {
        return (Patiente) patienteService.addPatiente(patiente);
    }

    @GetMapping("/test")
    public String testEndpoint() {
        return "Endpoint test successful";
    }

    @DeleteMapping("/patiente/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable long id) {
       // patienteService.deletePatient(id);
        return ResponseEntity.ok("Patient deleted successfully");
    }


}
