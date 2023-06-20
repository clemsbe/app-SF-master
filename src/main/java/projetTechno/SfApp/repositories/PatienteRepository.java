package projetTechno.SfApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import projetTechno.SfApp.models.entities.Patiente;

@Repository
public interface PatienteRepository extends JpaRepository<Patiente, Long>, JpaSpecificationExecutor {
}
