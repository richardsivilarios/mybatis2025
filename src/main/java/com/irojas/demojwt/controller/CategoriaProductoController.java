package com.irojas.demojwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.irojas.demojwt.entity.dto.vcategoriaproducto;
import lombok.RequiredArgsConstructor;
import com.irojas.demojwt.service.VCategoriaProductoService;

import java.util.List;
@RestController
@RequestMapping("/api/categoriaproducto")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://locahost:8081"})
public class CategoriaProductoController {
    private final VCategoriaProductoService vcategoriaproductoservice;
    @GetMapping
    public List<vcategoriaproducto> getAll() {
        return vcategoriaproductoservice.listar();

    }

}
