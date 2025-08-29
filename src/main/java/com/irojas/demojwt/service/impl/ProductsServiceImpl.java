package com.irojas.demojwt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.irojas.demojwt.entity.Products;
import com.irojas.demojwt.mapper.ProductsMapper;
import com.irojas.demojwt.service.ProductsService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {
private final ProductsMapper productsMapper;
@Override
public List<Products> getByCategoryName(String categoryName) {
        if (categoryName == null || categoryName.isBlank()) {
            throw new IllegalArgumentException("categoryName es obligatorio");
        }
        return productsMapper.findByCategoryName(categoryName.trim());
    }

}
