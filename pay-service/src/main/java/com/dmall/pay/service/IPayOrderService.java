package com.dmall.pay.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dmall.pay.domain.dto.PayApplyDTO;
import com.dmall.pay.domain.dto.PayOrderFormDTO;
import com.dmall.pay.domain.po.PayOrder;

/**
 * <p>
 * 支付订单 服务类
 * </p>
 *
 * @author 赵哥
 */
public interface IPayOrderService extends IService<PayOrder> {

    String applyPayOrder(PayApplyDTO applyDTO);

    void tryPayOrderByBalance(PayOrderFormDTO payOrderFormDTO);
}
