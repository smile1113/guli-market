package com.smile.gulimall.product.dao;

import com.smile.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yexiaoxiao
 * @email 1966474274@qq.com
 * @date 2023-04-05 14:35:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
