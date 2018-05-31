package com.mt.demo.feignclienttwo.demo;

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
@FeignClient(value = "FEIGN-CLIENT-ONE")
public interface OneService {

    @RequestMapping(value = "/one/sayhi",method = RequestMethod.GET)
    String sayHiFromClientTwo(@RequestParam(value = "name") String name);
}
