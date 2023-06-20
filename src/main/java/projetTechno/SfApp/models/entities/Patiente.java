package projetTechno.SfApp.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.yaml.snakeyaml.events.Event;

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
    private int numeroNational;
    @Column
    private String gynecologue;
    @Column
    @NotNull
    private String mutuelle;
    @Column
    @NotNull
    private int nTelephone;
    @Column
    private String mail;

@ManyToMany
private List<Adresse> adressesList;

@OneToMany(mappedBy = "patiente")
    private List<ActeMedic> acteMedic;

@OneToMany(mappedBy = "patiente")
    private List<ActeSf> acteSfList;

@OneToMany(mappedBy = "patiente")
    private List<Bebe> bebeList;


}
