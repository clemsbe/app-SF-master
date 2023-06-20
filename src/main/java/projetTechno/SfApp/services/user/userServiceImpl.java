package projetTechno.SfApp.services.user;

import org.springframework.stereotype.Service;
import projetTechno.SfApp.models.entities.User;
import projetTechno.SfApp.repositories.UserRepository;
import projetTechno.SfApp.services.CrudServiceImpl;
@Service
public class userServiceImpl extends CrudServiceImpl<UserRepository, User, Integer> {
    protected userServiceImpl(UserRepository repository) {
        super(repository);
    }
}
