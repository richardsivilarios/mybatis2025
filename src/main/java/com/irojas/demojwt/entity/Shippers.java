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
public class Shippers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer shipperid;

    private String shippername;

    private String phone;


}
