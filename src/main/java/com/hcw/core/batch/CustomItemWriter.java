package com.hcw.core.batch;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.support.transaction.TransactionAwareProxyFactory;

import java.util.List;

/**
 * Created by huangchunwu on 2019/1/10.
 */
public class CustomItemWriter<T> implements ItemWriter<T> {

    List<T> output = TransactionAwareProxyFactory.createTransactionalList();
    public void write(List<? extends T> items) throws Exception {
        output.addAll(items);
    }
    public List<T> getOutput() {
        return output;
    }
}
