package com.irojas.demojwt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.irojas.demojwt.entity.Categories;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoriesMapper extends BaseMapper<Categories> {
//  CRUD listo por BaseMapper (selectList, selectById, etc)

}
