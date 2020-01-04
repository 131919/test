package com.goshen.controller;
import com.goshen.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Lenovo on 2019/11/6.
 *
 * @Author: LDH
 * @date:2019/11/6 10:55
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService service;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test() {
        System.out.println("执行Controller");
        service.ServiceTest();
    }

}
