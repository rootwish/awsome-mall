package com.awsome.mall.coupon.dao;

import com.awsome.mall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 22:26:32
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
