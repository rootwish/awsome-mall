package com.awsome.mall.order.dao;

import com.awsome.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 23:43:30
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
