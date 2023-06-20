package projetTechno.SfApp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import projetTechno.SfApp.models.entities.ActeMedic;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface ActeMedicRepository extends JpaRepository<ActeMedic, Integer>, JpaSpecificationExecutor {
    @Override
    List<ActeMedic> findAll();

    List<ActeMedic> findAllByOrderByPositionAsc();


}



//    chatGTP :
//        Page<ActeMedic> findAllByOrderByPositionAsc(Pageable pageable);

