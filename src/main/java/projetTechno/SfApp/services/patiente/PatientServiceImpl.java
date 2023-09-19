package projetTechno.SfApp.services.patiente;

import org.springframework.stereotype.Service;
import projetTechno.SfApp.models.entities.Patiente;
import projetTechno.SfApp.repositories.PatienteRepository;
import projetTechno.SfApp.services.CrudServiceImpl;

import java.util.List;

@Service
public class PatientServiceImpl extends CrudServiceImpl<PatienteRepository, Patiente, Long> implements PatienteService {

    private final PatienteRepository patienteRepository;
    protected PatientServiceImpl(PatienteRepository repository, PatienteRepository patienteRepository) {
        super(repository);
        this.patienteRepository = patienteRepository;
    }

    @Override
    public Patiente addPatiente(Patiente patiente) {
        return patienteRepository.save(patiente);}

    @Override
    public List<Patiente> getAllPatiente(){

        return repository.findAll();
    }
    @Override
    public List<Patiente> deletePatient(long id) {
        patienteRepository.deleteById(id);
        return getAllPatiente();
    }


}
