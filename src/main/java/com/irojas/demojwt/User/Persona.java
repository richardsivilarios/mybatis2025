package com.irojas.demojwt.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity
@Table(name = "persona", schema = "public")
public class Persona {
    @Id
    @GeneratedValue
    Integer id; 
    String nombre; 
    String dni; 
    @OneToOne
    @JoinColumn(name="pasaporte_id")
    private Pasaporte pasaporte;

}
