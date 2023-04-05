package com.smile.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smile.gulimall.common.utils.PageUtils;
import com.smile.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author yexiaoxiao
 * @email 1966474274@qq.com
 * @date 2023-04-05 14:35:41
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

