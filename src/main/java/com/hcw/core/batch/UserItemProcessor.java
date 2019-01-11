package com.hcw.core.batch;
import org.springframework.batch.item.ItemProcessor;


public class UserItemProcessor implements ItemProcessor<Object, Object> {

	public Object process(Object result) throws Exception {
		return result;
	}

}
