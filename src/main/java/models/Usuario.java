package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String nombre;
    private String apellidos;
    private String username;
    private String email;

    @ManyToMany (cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "ejercicios_usuario",
            joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName
                    = "id"),
            inverseJoinColumns = @JoinColumn(name = "ejercicios_id",
                    referencedColumnName = "id"))
    private List<Ejercicios> ejercicios;

    @ManyToOne
    @JoinColumn(name = "equipo_id", referencedColumnName = "id")
    private Equipo equipo;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.REMOVE)
    private Idioma idioma;


}
