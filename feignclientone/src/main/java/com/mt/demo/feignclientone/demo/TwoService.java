package com.mt.demo.feignclientone.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TwoService
 *
 * @author MT.LUO
 * 2018/5/30 23:13
 * @Description:
 */
@FeignClient(value = "FEIGN-CLIENT-TWO", fallback = TwoFailback.class)
public interface TwoService {

    @RequestMapping(value = "/two/sayhi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
