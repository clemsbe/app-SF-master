package projetTechno.SfApp.models.dtos;

import lombok.Builder;
import lombok.Data;
import projetTechno.SfApp.models.entities.Patiente;

import java.util.Date;

@Data
@Builder
public class PatienteDTO {

    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private int numeroNational;
    private String gynecologue;
    private String mutuelle;

    private int nTelephone;

    private String mail;


    public static PatienteDTO toDTO(Patiente patiente) {
        PatienteDTO.PatienteDTOBuilder dto = PatienteDTO.builder();
        return dto
                .nom(patiente.getNom())
                .prenom(patiente.getPrenom())
                .dateDeNaissance(patiente.getDateDeNaissance())
                .numeroNational(patiente.getNumeroNational())
                .gynecologue(patiente.getGynecologue())
                .mutuelle(patiente.getMutuelle())
                .nTelephone(patiente.getNTelephone())
                .mail(patiente.getMail())
                .build();
    }

}
