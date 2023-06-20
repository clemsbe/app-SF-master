package projetTechno.SfApp.services.acteMedic;

import projetTechno.SfApp.models.entities.ActeMedic;
import projetTechno.SfApp.services.CrudService;

import java.util.List;
import java.util.stream.Stream;

public interface ActeMedicService extends CrudService<ActeMedic, Integer> {
    Stream<ActeMedic> findAllByOrderByPositionAsc();

    List<ActeMedic> getAllActeMedics();
}
