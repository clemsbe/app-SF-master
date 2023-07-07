package projetTechno.SfApp.services.patiente;

import projetTechno.SfApp.models.dtos.PatienteDTO;
import projetTechno.SfApp.models.entities.Patiente;
import projetTechno.SfApp.models.forms.PatienteAddForm;
import projetTechno.SfApp.services.CrudService;

import java.util.List;
import java.util.stream.Stream;

public interface patienteService<patienteId, number> extends CrudService<Patiente, Integer> {

    Patiente addPatiente(Patiente patiente);

    List<Patiente> getAllPatiente();

//    List<Patiente> deletePatiente();
//
//    List<Patiente> deletePatiente(long id);
}

