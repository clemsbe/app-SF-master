package projetTechno.SfApp.repositories;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import projetTechno.SfApp.models.entities.ActeMedic;
import projetTechno.SfApp.models.entities.ActeSf;

import java.util.stream.Stream;

@Repository
public interface ActeSfRepository extends JpaRepository<ActeSf, Integer>, JpaSpecificationExecutor {

}
