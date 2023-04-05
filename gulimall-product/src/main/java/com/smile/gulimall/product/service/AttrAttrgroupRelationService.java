package com.smile.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smile.gulimall.common.utils.PageUtils;
import com.smile.gulimall.common.utils.PageUtils;
import com.smile.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author yexiaoxiao
 * @email 1966474274@qq.com
 * @date 2023-04-05 14:35:40
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

