package projetTechno.SfApp.models.dtos;

import lombok.Builder;
import lombok.Data;
import projetTechno.SfApp.models.entities.ActeSf;

import java.util.Date;


@Data
@Builder
public class ActeSfDTO {

    private long id;
    private String titre;
    private String action;
    private Date date;
    private String prix;

    public static ActeSfDTO toDTO(ActeSf acteSf){
        ActeSfDTO.ActeSfDTOBuilder dto = ActeSfDTO.builder();
        return dto
                .id(acteSf.getId())
                .titre(acteSf.getTitre())
                .action(acteSf.getAction())
                .date(acteSf.getDate())
                .prix(acteSf.getPrix())
                .build();
            }
}
