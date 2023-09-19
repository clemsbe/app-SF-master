package projetTechno.SfApp.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
public class Patiente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    @NotNull
    private Long id;
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
    private String numeroNational;
    @Column
    private String gynecologue;
    @Column
    @NotNull
    private String mutuelle;

    @Column
    private String mail;
    @Column
    @NotNull
    private String numeroDeTelephone;
    @Column
    @NotNull

    private String ville;
    @Column
    @NotNull

    private String rue;
    @Column
    @NotNull

    private String numeroDeMaison;
    @Column

    private String lieuDit;
    @Column

    private String traitSpec;
    @Column

    private int km;

@ManyToMany
private List<Adresse> adressesList;

@OneToMany(mappedBy = "patiente")
    private List<ActeMedic> acteMedic;

@OneToMany(mappedBy = "patiente")
    private List<ActeSf> acteSfList;

@OneToMany(mappedBy = "patiente")
    private List<Bebe> bebeList;


}
