package com.irojas.demojwt.User;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;
@Entity
@Data
public class Empleado {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String puesto;
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;
}
