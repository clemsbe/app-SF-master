package projetTechno.SfApp.services.patiente;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import projetTechno.SfApp.models.entities.Patiente;
import projetTechno.SfApp.repositories.PatienteRepository;
import projetTechno.SfApp.services.CrudServiceImpl;

import java.util.List;
import java.util.stream.Stream;

@Repository
@Service
public class patienteServiceImpl<patiente> extends CrudServiceImpl<PatienteRepository, Patiente, Integer> implements patienteService {
    private final PatienteRepository patienteRepository;

    protected patienteServiceImpl(PatienteRepository repository,
                                  PatienteRepository patienteRepository) {
        super(repository);
        this.patienteRepository = patienteRepository;}


    @Override
    public Patiente addPatiente(Patiente patiente) {
        return patienteRepository.save(patiente);
    }

    @Override
    public List<Patiente> getAllPatiente(){

        return repository.findAll();
    }

//    @Override
//    public List<Patiente> deletePatiente() {
//        return null;
//    }
//
//    @Override
//    public List<Patiente> deletePatiente(long id) {
//        patienteRepository.deleteById(id);
//        return getAllPatiente();
//    }


}
