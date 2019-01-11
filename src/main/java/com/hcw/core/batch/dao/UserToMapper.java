package com.hcw.core.batch.dao;


import com.hcw.core.batch.UserTo;

import java.util.List;


public interface UserToMapper {
    /**
     * spring batch 批量插入
     * @param list
     * @return
     */
    int batchInsert(List<UserTo> list);
}
