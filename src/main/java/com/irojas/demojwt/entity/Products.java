package com.irojas.demojwt.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;

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
public class Products  {
@Id
  @GeneratedValue
    private Integer productid;

    private String productname;

    //private Integer supplierid;
    @JoinColumn(name="supplierid")
    @jakarta.persistence.ManyToOne
    Suppliers supplierid;

 @JoinColumn(name="categoryid")
    @jakarta.persistence.ManyToOne
    Categories categoryid;
    //private Integer categoryid;

    private String unit;

    private BigDecimal price;

   


}
