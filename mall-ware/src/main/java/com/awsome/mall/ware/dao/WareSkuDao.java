package com.awsome.mall.ware.dao;

import com.awsome.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 23:34:01
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
