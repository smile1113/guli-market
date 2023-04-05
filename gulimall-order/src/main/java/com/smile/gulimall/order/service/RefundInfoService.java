package com.smile.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smile.gulimall.common.utils.PageUtils;
import com.smile.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author yexiaoxiao
 * @email 1966474274@qq.com
 * @date 2023-04-05 14:57:40
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

