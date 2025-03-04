package com.dmall.cart.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dmall.cart.domain.dto.CartFormDTO;
import com.dmall.cart.domain.po.Cart;
import com.dmall.cart.domain.vo.CartVO;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 订单详情表 服务类
 * </p>
 *
 * @author 赵哥
 */
public interface ICartService extends IService<Cart> {

    void addItem2Cart(CartFormDTO cartFormDTO);

    List<CartVO> queryMyCarts();

    void removeByItemIds(Collection<Long> itemIds);
}
