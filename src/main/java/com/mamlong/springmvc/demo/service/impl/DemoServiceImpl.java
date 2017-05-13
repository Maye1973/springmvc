package com.mamlong.springmvc.demo.service.impl;

import com.mamlong.springmvc.demo.service.IDemoService;
import com.mamlong.springmvc.swagger.service.ISwaggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by MaMingLong on 2017/1/14.
 */
@Service
public class DemoServiceImpl implements IDemoService{

    @Autowired
    private ISwaggerService swaggerService;

    @Override
    public Date getCurrentDate() {

        return new Date();
    }
}
