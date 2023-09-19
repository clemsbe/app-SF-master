package projetTechno.SfApp.services.patiente;

import projetTechno.SfApp.models.entities.Patiente;
import projetTechno.SfApp.services.CrudService;

import java.util.List;

public interface PatienteService extends CrudService<Patiente, Long> {

  Patiente addPatiente(Patiente patiente);

    List<Patiente> getAllPatiente();

    List<Patiente> deletePatient(long id);

    // Vous pouvez ajouter d'autres méthodes spécifiques ici
}
