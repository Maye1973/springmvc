package com.mamlong.springmvc.demo.controller;

import com.mamlong.springmvc.demo.service.IDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by MaMingLong on 2017/1/14.
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private IDemoService demoService;

    @RequestMapping(value = "/sayHello/{name}", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String sayHello(@PathVariable(value = "name") String name){
        logger.info("DemoController.sayHello入参：" + name);
        return "hello " + name + " now is " + demoService.getCurrentDate();
    }

}
