package projetTechno.SfApp.services.patiente;

import projetTechno.SfApp.models.dtos.PatienteDTO;
import projetTechno.SfApp.models.entities.Patiente;
import projetTechno.SfApp.models.forms.PatienteAddForm;
import projetTechno.SfApp.services.CrudService;

public interface patienteService extends CrudService<Patiente, Integer> {
    PatienteDTO createPatiente(PatienteAddForm patienteAddForm);

    Patiente create(PatienteAddForm form);

    Patiente addPatiente(Patiente patiente);

}
