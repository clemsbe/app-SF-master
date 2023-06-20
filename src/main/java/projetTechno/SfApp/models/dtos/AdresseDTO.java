package projetTechno.SfApp.models.dtos;

import lombok.Builder;
import lombok.Data;
import projetTechno.SfApp.models.entities.Adresse;

@Data
@Builder
public class AdresseDTO {

    private int id;
    private String ville;
    private String rue;
    private int numero;
    private String lieuDit;
    private String traitSpec;
    private int km;

    public static AdresseDTO toDTO(Adresse adresse) {
        AdresseDTO.AdresseDTOBuilder dto= AdresseDTO.builder();
        return dto
                .id(adresse.getId())
                .ville(adresse.getVille())
                .rue(adresse.getRue())
                .numero(adresse.getNumero())
                .lieuDit(adresse.getLieuDit())
                .traitSpec(adresse.getTraitSpec())
                .km(adresse.getKm())
                .build();
    }

}
