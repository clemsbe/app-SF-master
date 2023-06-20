package projetTechno.SfApp.models.forms;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import projetTechno.SfApp.models.entities.Patiente;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatienteAddForm {


    private String nom;

    private String prenom;

    private Date dateDeNaissance;


    private int numeroNational;

    private String gynecologue;
    private String mutuelle;

    private int nTelephone;
    private String mail;



}
