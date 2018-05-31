package com.mt.demo.feignclientone.demo;

import org.springframework.stereotype.Component;

/**
 * TwoFailback
 *
 * @author MT.LUO
 * 2018/5/31 12:04
 * @Description:
 */
@Component
public class TwoFailback implements TwoService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hello " + name + " , this messge send failed ";
    }
}
