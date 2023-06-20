package projetTechno.SfApp.services.bebe;

import org.springframework.stereotype.Service;
import projetTechno.SfApp.models.entities.Bebe;
import projetTechno.SfApp.repositories.BebeRepository;
import projetTechno.SfApp.services.CrudServiceImpl;

@Service
public class bebeServiceImpl extends CrudServiceImpl<BebeRepository, Bebe, Integer> implements bebeService{
    protected bebeServiceImpl(BebeRepository repository) {
        super(repository);
    }
}
