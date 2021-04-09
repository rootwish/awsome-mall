package com.awsome.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import  com.awsome.mall.common.utils.PageUtils;
import com.awsome.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 00:48:21
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

