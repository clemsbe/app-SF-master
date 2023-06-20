package projetTechno.SfApp.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @NotNull
    private int id;

    @Column
    @NotNull
    private String titre;
    @Column
    private String droit;

    @Column
    @NotNull
    @Email
    private String email;

    @Column
    @NotNull
    private String password;
}
