package com.irojas.demojwt.entity;

import java.time.LocalDateTime;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Micuenta oficial：Richard Sivila
 * @since 2025-07-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Employees  {
    @GeneratedValue
    @Id
    private Integer employeeid;

    private String lastname;

    private String firstname;

    private LocalDateTime birthdate;

    private String photo;

    private String notes;
    
    @OneToMany(mappedBy="employeeid")
    Set <Orders> orders;
    

}
