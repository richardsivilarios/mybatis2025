package com.irojas.demojwt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.irojas.demojwt.entity.Categories;
import com.irojas.demojwt.mapper.CategoriesMapper;
import com.irojas.demojwt.service.CategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriesServiceImpl implements CategoriesService {

    private final CategoriesMapper categoriesMapper;

    @Override
    public List<Categories> listar() {
        // caso A mostrar las categorias 
        // select * from categories 
        //return categoriesMapper.selectList(null);
        // select * from categories ORDER BY categoryid DESC
        return categoriesMapper.selectList(new QueryWrapper<Categories>().orderByDesc("categoryid"));

    }
    @Override
    public String abrazo() {
        return "";
    };
}
