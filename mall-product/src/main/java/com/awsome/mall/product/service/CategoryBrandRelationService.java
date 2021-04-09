package com.awsome.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import  com.awsome.mall.common.utils.PageUtils;
import com.awsome.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 00:48:21
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

