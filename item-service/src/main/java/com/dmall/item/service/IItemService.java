package com.dmall.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dmall.item.domain.dto.ItemDTO;
import com.dmall.item.domain.dto.OrderDetailDTO;
import com.dmall.item.domain.po.Item;


import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author 赵哥
 */
public interface IItemService extends IService<Item> {

    void deductStock(List<OrderDetailDTO> items);

    List<ItemDTO> queryItemByIds(Collection<Long> ids);
}
