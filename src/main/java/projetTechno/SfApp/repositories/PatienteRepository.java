package projetTechno.SfApp.repositories;

import jakarta.transaction.Transactional;
import org.junit.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import projetTechno.SfApp.models.entities.Patiente;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

@Repository
public interface PatienteRepository extends JpaRepository<Patiente, Long>, JpaSpecificationExecutor {
    List<Patiente> findAll();

//        List<Patiente> delete();
}

