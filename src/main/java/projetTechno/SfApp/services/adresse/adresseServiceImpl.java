package projetTechno.SfApp.services.adresse;

import org.springframework.stereotype.Service;
import projetTechno.SfApp.models.entities.Adresse;
import projetTechno.SfApp.repositories.AdresseRepository;
import projetTechno.SfApp.services.CrudServiceImpl;

@Service
public class adresseServiceImpl extends CrudServiceImpl<AdresseRepository, Adresse, Integer>implements adresseService {
    protected adresseServiceImpl(AdresseRepository repository) {

        super(repository);
    }
}
