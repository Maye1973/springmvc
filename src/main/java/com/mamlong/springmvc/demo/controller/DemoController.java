package com.mamlong.springmvc.demo.controller;

import com.mamlong.springmvc.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import java.util.Date;

/**
 * Created by MaMingLong on 2017/1/14.
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @RequestMapping(value = "/sayHello/{name}", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String sayHello(@PathVariable(value = "name") String name){
        return "hello " + name + " now is " + demoService.getCurrentDate();
    }

}
