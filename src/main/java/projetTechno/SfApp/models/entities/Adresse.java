package projetTechno.SfApp.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @NotNull
    private int id;
    @Column
    @NotNull
    @Setter
    @Getter

    private String ville;
    @Column
    @NotNull
    @Setter
    @Getter
    private String rue;
    @Column
    @NotNull
    @Setter
    @Getter
    private int numero;
    @Column
    @Setter
    @Getter
    private String lieuDit;
    @Column
    @Setter
    @Getter
    private String traitSpec;
    @Column
    @NotNull
    @Setter
    @Getter
    private int km;


    @ManyToMany
    private List<Patiente> patienteList;
}
