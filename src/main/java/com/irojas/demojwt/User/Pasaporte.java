package com.irojas.demojwt.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToOne;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.Table;;

@Data 
@Entity
@Table(name = "pasaporte", schema = "public")
public class Pasaporte {
    @Id
    @GeneratedValue
    Integer id; 
    String numero;
    String paisEmision;
    @OneToOne(mappedBy="pasaporte")
    private Persona persona;
}
