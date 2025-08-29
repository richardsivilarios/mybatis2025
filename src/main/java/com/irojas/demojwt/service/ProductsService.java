package com.irojas.demojwt.service;
import java.util.List;

import com.irojas.demojwt.entity.Products;


public interface ProductsService {
public List<Products> getByCategoryName(String categoryName);
}
