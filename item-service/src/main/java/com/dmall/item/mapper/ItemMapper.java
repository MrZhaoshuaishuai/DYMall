package com.dmall.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dmall.item.domain.dto.OrderDetailDTO;
import com.dmall.item.domain.po.Item;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author 赵哥
 */
public interface ItemMapper extends BaseMapper<Item> {

    @Update("UPDATE item SET stock = stock - #{num} WHERE id = #{itemId}")
    void updateStock(OrderDetailDTO orderDetail);
}
