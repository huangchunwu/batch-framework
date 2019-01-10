package com.hcw.core.batch;

import org.springframework.batch.item.ItemReader;


import java.util.List;

/**
 * Created by huangchunwu on 2019/1/10.
 */
public class CustomItemReader<T> implements ItemReader<T> {

    List<T> items;
    public CustomItemReader(List<T> items) {
        this.items = items;
    }
    public T read() throws Exception{
        if (!items.isEmpty()) {
            return items.remove(0);
        }
        return null;
    }
}
