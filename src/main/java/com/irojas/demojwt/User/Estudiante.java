package com.irojas.demojwt.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class Estudiante {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String matricula;
    
    @ManyToMany
    private Set<Curso> cursos;
}
