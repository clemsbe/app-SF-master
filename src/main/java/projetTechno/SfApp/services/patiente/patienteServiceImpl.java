package projetTechno.SfApp.services.patiente;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import projetTechno.SfApp.models.dtos.PatienteDTO;
import projetTechno.SfApp.models.entities.Patiente;
import projetTechno.SfApp.models.forms.PatienteAddForm;
import projetTechno.SfApp.repositories.PatienteRepository;
import projetTechno.SfApp.services.CrudServiceImpl;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Service
public class patienteServiceImpl extends CrudServiceImpl<PatienteRepository, Patiente, Integer> implements patienteService {
    private final PatienteRepository patienteRepository;

    protected patienteServiceImpl(PatienteRepository repository,
                                  PatienteRepository patienteRepository) {
        super(repository);
        this.patienteRepository = patienteRepository;
    }


    @Override
    public PatienteDTO createPatiente(PatienteAddForm patienteAddForm) {
        return null;
    }

    @Override
    public Patiente create(PatienteAddForm form) {
        return null;
    }

    @Override
    public Patiente addPatiente(Patiente patiente) {
        return patienteRepository.save(patiente);
    }

}
