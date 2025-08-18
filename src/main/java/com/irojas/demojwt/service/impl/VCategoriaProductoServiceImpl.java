package com.irojas.demojwt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.irojas.demojwt.entity.dto.vcategoriaproducto;
import com.irojas.demojwt.mapper.VCategoriaProductoMapper;
import com.irojas.demojwt.service.VCategoriaProductoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VCategoriaProductoServiceImpl implements VCategoriaProductoService {
    
    private final VCategoriaProductoMapper vcategoriaproductoMapper;
    @Override
    public List<vcategoriaproducto> listar() {   
         return vcategoriaproductoMapper.selectList(null);
}
}
