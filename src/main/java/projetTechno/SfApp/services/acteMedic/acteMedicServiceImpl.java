package projetTechno.SfApp.services.acteMedic;

import org.springframework.stereotype.Service;
import projetTechno.SfApp.models.entities.ActeMedic;
import projetTechno.SfApp.repositories.ActeMedicRepository;
import projetTechno.SfApp.services.CrudServiceImpl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class acteMedicServiceImpl extends CrudServiceImpl<ActeMedicRepository, ActeMedic, Integer> implements ActeMedicService {
    public acteMedicServiceImpl(ActeMedicRepository repository) {

        super(repository);
    }

    @Override
    public Stream<ActeMedic> findAllByOrderByPositionAsc() {
        return (Stream<ActeMedic>) repository.findAllByOrderByPositionAsc();
    }

    @Override
    public List<ActeMedic> getAllActeMedics() {

        return repository.findAllByOrderByPositionAsc();
    }

}
