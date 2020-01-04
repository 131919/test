package com.goshen.dao;

import org.apache.ibatis.annotations.Select;


/**
 * Created by Lenovo on 2019/11/6.
 *
 * @Author: LDH
 * @date:2019/11/6 19:08
 */

public interface PersonDao {

      @Select(value = "select * from person")
    public void Select();
}
