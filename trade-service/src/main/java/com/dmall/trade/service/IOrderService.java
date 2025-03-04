package com.dmall.trade.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dmall.trade.domain.dto.OrderFormDTO;
import com.dmall.trade.domain.po.Order;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 赵哥
 */
public interface IOrderService extends IService<Order> {

    Long createOrder(OrderFormDTO orderFormDTO);

    void markOrderPaySuccess(Long orderId);
}
