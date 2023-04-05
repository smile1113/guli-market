package com.smile.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smile.gulimall.common.utils.PageUtils;
import com.smile.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author yexiaoxiao
 * @email 1966474274@qq.com
 * @date 2023-04-05 14:35:41
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

