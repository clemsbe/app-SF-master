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
public class Bebe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @NotNull
    private int id;
    @Column
    @NotNull
    private String nom;
    @Column
    @NotNull
    private String prenom;
    @Column
    @NotNull
    private Date dateDeNaissance;
    @Column
    @NotNull
    private String hopital;

    @ManyToOne
    @JoinColumn(name = "bebe")
    private Patiente patiente;


}
