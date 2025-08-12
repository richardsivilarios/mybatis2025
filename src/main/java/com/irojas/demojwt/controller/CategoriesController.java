package com.irojas.demojwt.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import com.irojas.demojwt.service.CategoriesService;

import lombok.RequiredArgsConstructor;

import java.util.List;
import com.irojas.demojwt.entity.Categories;
@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://locahost:8081"})
public class CategoriesController {
    private final CategoriesService categoriesService;
    @GetMapping
    public List<Categories> getAll() {
        return categoriesService.listar();

    }

}
