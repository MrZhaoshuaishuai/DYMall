package com.dmall.common.domain;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dmall.common.utils.BeanUtils;
import com.dmall.common.utils.CollUtils;
import com.dmall.common.utils.Convert;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageDTO<T> {
    protected Long total;
    protected Long pages;
    protected List<T> list;


    public static <T> PageDTO<T> empty(Page<?> page) {
        return new PageDTO<>(page.getTotal(), page.getPages(), CollUtils.emptyList());
    }



    public static <T, R> PageDTO<T> of(Page<R> page, Class<T> clazz) {
        return new PageDTO<>(page.getTotal(), page.getPages(), BeanUtils.copyList(page.getRecords(), clazz));
    }


}
