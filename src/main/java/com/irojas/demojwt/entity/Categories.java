package com.irojas.demojwt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import java.util.Set;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Categories  {

    @Id
    @GeneratedValue
    private Integer categoryid;

    private String categoryname;

    private String description;

    @OneToMany(mappedBy = "categoryid")
    @TableField(exist = false)
    Set <Products> products;


}
