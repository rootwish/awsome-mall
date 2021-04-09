package com.awsome.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.awsome.mall.common.utils.PageUtils;
import com.awsome.mall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 22:26:32
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

