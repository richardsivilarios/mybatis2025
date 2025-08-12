package com.irojas.demojwt.entity;

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
public class Orderdetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer orderdetailid;

    private Integer orderid;

    private Integer productid;

    private Integer quantity;


}
