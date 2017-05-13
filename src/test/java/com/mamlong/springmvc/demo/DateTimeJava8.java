package com.mamlong.springmvc.demo;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * ************************************************
 * DateTimeJava8.java <br/>
 * 功能描述: java8日期时间API测试<br/>
 * <p>
 * Copyright: Copyright (c) 2016-2017<br/>
 * Company: 深圳市欧瑞博电子有限公司 <br/>
 *
 * @author MaMingLong
 * @version 1.0
 * @date 2017/5/6 9:38
 * ************************************************
 */
public class DateTimeJava8 {

    public static void main(String[] args){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("DateTimeFormatter.ISO_DATE="
                + localDateTime.format(DateTimeFormatter.ISO_DATE));
        System.out.println("DateTimeFormatter.ISO_DATE_TIME="
                + localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE="
                + localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE_TIME="
                + localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("DateTimeFormatter.ISO_LOCAL_TIME="
                + localDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("DateTimeFormatter.ISO_ORDINAL_DATE="
                + localDateTime.format(DateTimeFormatter.ISO_ORDINAL_DATE));
        System.out.println("DateTimeFormatter.ISO_WEEK_DATE="
                + localDateTime.format(DateTimeFormatter.ISO_WEEK_DATE));

        System.out.println("DateTimeFormatter.BASIC_ISO_DATE="
                + localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("DateTimeFormatter.ofPattern(\"yyyy-mm-dd hh:mm:ss.ms\")="
                + localDateTime.format(
                DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss.ms")));
    }
}
