package com.awsome.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.awsome.mall.common.utils.PageUtils;
import com.awsome.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 22:26:32
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

