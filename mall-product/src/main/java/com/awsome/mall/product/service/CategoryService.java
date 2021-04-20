package com.awsome.mall.product.service;

import com.awsome.mall.product.vo.Catelog2Vo;
import com.baomidou.mybatisplus.extension.service.IService;
import  com.awsome.mall.common.utils.PageUtils;
import com.awsome.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 00:48:21
 */
public interface CategoryService extends IService<CategoryEntity> {

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    /**
     * 找到catalogId 完整路径
     */
    Long[] findCateLogPath(Long catelogId);

    /**
     * 级联更新所有数据
     */
    void updateCascade(CategoryEntity category);

    List<CategoryEntity> getLevel1Categorys();

    Map<String, List<Catelog2Vo>> getCatelogJson();
}

