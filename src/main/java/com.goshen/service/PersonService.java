package com.goshen.service;

import com.goshen.dao.PersonDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Lenovo on 2019/11/6.
 *
 * @Author: LDH
 * @date:2019/11/6 10:56
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

   public void ServiceTest(){
        System.out.println("执行serviceTest");
         personDao.Select();
    }
}
