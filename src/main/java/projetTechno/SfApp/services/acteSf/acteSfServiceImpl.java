package projetTechno.SfApp.services.acteSf;

import org.springframework.stereotype.Service;
import projetTechno.SfApp.models.entities.ActeSf;
import projetTechno.SfApp.repositories.ActeSfRepository;
import projetTechno.SfApp.services.CrudServiceImpl;


@Service
public class acteSfServiceImpl extends CrudServiceImpl<ActeSfRepository, ActeSf, Integer> implements acteSfService {

    protected acteSfServiceImpl(ActeSfRepository repository) {
        super(repository);
    }



}
