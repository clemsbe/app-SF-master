package projetTechno.SfApp.models.dtos;

import lombok.Builder;
import lombok.Data;
import projetTechno.SfApp.models.entities.*;

import java.util.Date;

@Data
@Builder
public class ActeMedicDTO {

    private int id;
    private String action;
    private Date date;
    private String prix;

    public static ActeMedicDTO toDTO(ActeMedic acteMedic){
        ActeMedicDTOBuilder dto = ActeMedicDTO.builder();
        return dto
                .id(acteMedic.getId())
                .action(acteMedic.getAction())
                .date(acteMedic.getDate())
                .prix(acteMedic.getPrix())
                .build();
    }


}
