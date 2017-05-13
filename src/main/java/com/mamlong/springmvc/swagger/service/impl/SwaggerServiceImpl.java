package com.mamlong.springmvc.swagger.service.impl;

import com.mamlong.springmvc.demo.service.IDemoService;
import com.mamlong.springmvc.swagger.service.ISwaggerService;
import org.apache.zookeeper.data.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * ************************************************
 * .java <br/>
 * 功能描述: <br/>
 * <p>
 * Copyright: Copyright (c) 2016-2017<br/>
 * Company: 深圳市欧瑞博电子有限公司 <br/>
 *
 * @author MaMingLong
 * @version 1.0
 * @date 2017/5/7 22:05
 * ************************************************
 */
@Service(value = "swaggerService")
public class SwaggerServiceImpl implements ISwaggerService{

    @Autowired
    private IDemoService demoService;

    @Override
    public long currentTime() {
        return LocalDateTime.now().getNano();
    }
}
