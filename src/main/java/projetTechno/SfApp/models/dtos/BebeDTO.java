package projetTechno.SfApp.models.dtos;

import lombok.Builder;
import lombok.Data;
import projetTechno.SfApp.models.entities.Bebe;

import java.util.Date;

@Data
@Builder
public class BebeDTO {
    private int id;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String hopital;

    public static BebeDTO toDTO(Bebe bebe){
        BebeDTO.BebeDTOBuilder dto= BebeDTO.builder();
        return dto
                .id(bebe.getId())
                .nom(bebe.getNom())
                .prenom(bebe.getPrenom())
                .dateDeNaissance(bebe.getDateDeNaissance())
                .hopital(bebe.getHopital())
                .build();

    }

}
