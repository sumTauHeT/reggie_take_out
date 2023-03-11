package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Locale;

@Mapper
public interface CategoryMapper extends BaseMapper<Locale.Category> {
}
