package com.irojas.demojwt.entity;

import java.io.Serializable;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;
/**
 * <p>
 * 
 * </p>
 *
 * @author Micuenta oficial：Richard Sivila
 * @since 2025-07-30
 */
@Data
@Entity 
@EqualsAndHashCode(callSuper = false)
public class Customers implements Serializable {

    @GeneratedValue
    @Id 
    private Integer customerid;

    private String customername;

    private String contactname;

    private String address;

    private String city;

    private String postalcode;

    private String country;

    @OneToMany(mappedBy = "customerid") 
    Set<Orders> orders;   

}
