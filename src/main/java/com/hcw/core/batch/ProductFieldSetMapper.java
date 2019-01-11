package com.hcw.core.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


/**
 * Created by huangchunwu on 2019/1/10.
 */
public class ProductFieldSetMapper implements FieldSetMapper<Product>
{
    @Override
    public Product mapFieldSet(FieldSet fieldSet) throws BindException {
        Product product = new Product();
        product.setId( fieldSet.readString( "id" ) );
        product.setName( fieldSet.readString( "name" ) );
        return product;
    }
}
