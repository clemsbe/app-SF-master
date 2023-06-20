package projetTechno.SfApp.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
public class ActeMedic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @NotNull
    private int id;
    @Column
    @NotNull
    private String action;
    @Column
    private Date date;
    @Column
    @NotNull
    private String prix;
    @Column
    @NotNull
    private int position;

    @ManyToOne
    private Patiente patiente;


}
