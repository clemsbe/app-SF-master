package projetTechno.SfApp.models.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import projetTechno.SfApp.models.entities.Patiente;

import java.util.Date;

@Data
@Builder
public class PatienteDTO {

    private Long id;

    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String numeroNational;
    private String gynecologue;
    private String mutuelle;
    private String mail;
    private String numeroDeTelephone;
    private String ville;

    private String rue;

    private String numeroDeMaison;

    private String lieuDit;

    private String traitSpec;

    private int km;

    public static PatienteDTO toDTO(Patiente patiente) {
        PatienteDTO.PatienteDTOBuilder dto = PatienteDTO.builder();
        return dto
                .nom(patiente.getNom())
                .prenom(patiente.getPrenom())
                .dateDeNaissance(patiente.getDateDeNaissance())
                .numeroNational(patiente.getNumeroNational())
                .gynecologue(patiente.getGynecologue())
                .mutuelle(patiente.getMutuelle())
                .numeroDeTelephone(patiente.getNumeroDeTelephone())
                .mail(patiente.getMail())
                .ville(patiente.getVille())
                .rue(patiente.getRue())
                .numeroDeMaison(patiente.getNumeroDeMaison())
                .lieuDit(patiente.getLieuDit())
                .traitSpec(patiente.getTraitSpec())
                .km(patiente.getKm())
                .build();
    }

}
