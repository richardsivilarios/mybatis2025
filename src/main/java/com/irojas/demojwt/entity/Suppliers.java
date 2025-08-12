package com.irojas.demojwt.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Suppliers {

    @Id
    @GeneratedValue
    private Integer supplierid;
    private String suppliername;
    private String contactname;
    private String address;
    private String city;
    private String postalcode;
    private String country;
    private String phone;
    @OneToMany(mappedBy = "supplierid")
    @TableField(exist = false)
    Set <Products> products;


}
