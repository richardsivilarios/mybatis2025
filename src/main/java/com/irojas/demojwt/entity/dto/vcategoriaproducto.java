package com.irojas.demojwt.entity.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class vcategoriaproducto {
 private Integer llaveprimaria;
 private String categoryname;
 private String productname; 
 private Long price; 

}
