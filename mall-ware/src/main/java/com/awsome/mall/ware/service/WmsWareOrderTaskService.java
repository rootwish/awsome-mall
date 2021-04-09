package com.awsome.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.awsome.mall.common.utils.PageUtils;
import com.awsome.mall.ware.entity.WmsWareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 23:03:27
 */
public interface WmsWareOrderTaskService extends IService<WmsWareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

