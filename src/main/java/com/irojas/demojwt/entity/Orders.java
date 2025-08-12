package com.irojas.demojwt.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;
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
public class Orders  {
    @GeneratedValue    
    @Id
    private Integer orderid;

    //private Integer customerid;

    //private Integer employeeid;

    private LocalDateTime orderdate;

    private Integer shipperid;
    @JoinColumn(name="customerid")
    @OneToOne 
    Customers customerid;

    @JoinColumn(name="employeeid")
    @OneToOne
    Employees employeeid;



}
