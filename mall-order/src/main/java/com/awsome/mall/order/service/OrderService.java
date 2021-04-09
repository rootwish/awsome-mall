package com.awsome.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.awsome.mall.common.utils.PageUtils;
import com.awsome.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 23:43:30
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

