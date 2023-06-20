package projetTechno.SfApp.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class ActeSf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @NotNull
    private Long id;
    @Column
    @NotNull
    @Setter
    @Getter
    private String titre;
    @Column
    @NotNull
    @Setter
    @Getter
    private String action;
    @Column
    @Setter
    @Getter
    private Date date;
    @Column
    @NotNull
    @Setter
    @Getter
    private String prix;

    @ManyToOne
    private Patiente patiente;

}
