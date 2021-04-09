package com.awsome.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.awsome.mall.common.utils.PageUtils;
import com.awsome.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author rootwish
 * @email rootwish233@gmail.com
 * @date 2021-04-08 22:55:15
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

