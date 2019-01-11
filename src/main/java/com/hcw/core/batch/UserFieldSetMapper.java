package com.hcw.core.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


/**
 * Created by huangchunwu on 2019/1/10.
 */
public class UserFieldSetMapper implements FieldSetMapper<UserTo>
{
    @Override
    public UserTo mapFieldSet(FieldSet fieldSet) throws BindException {
        UserTo userTo = new UserTo();
        userTo.setUserName(fieldSet.readString("id"));
        userTo.setAddress( fieldSet.readString( "name" ) );
        return userTo;
    }
}
