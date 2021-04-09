package com.awsome.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import  com.awsome.mall.common.utils.PageUtils;
import com.awsome.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 00:48:21
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

