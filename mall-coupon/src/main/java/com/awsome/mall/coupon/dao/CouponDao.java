package com.awsome.mall.coupon.dao;

import com.awsome.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 22:26:32
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
