package com.irojas.demojwt.User;
import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Departamento {
    @Id
    @GeneratedValue
    private Long id;    
    private String nombre;
    @OneToMany(mappedBy = "departamento")
    private List<Empleado> empleados;
}

