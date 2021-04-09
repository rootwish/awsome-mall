package com.awsome.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import  com.awsome.mall.common.utils.PageUtils;
import com.awsome.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 00:48:21
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

