package com.mt.demo.feignclientone.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * WebController
 *
 * @author MT.LUO
 * 2018/5/30 23:11
 * @Description:
 */
@RestController
public class WebController {

    @Autowired
    private TwoService twoService;

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/one/sayhitwo", method = RequestMethod.GET)
    public String clientOneSayHiTwo(@RequestParam String name) {
        return twoService.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/one/sayhi", method = RequestMethod.GET)
    public String clientOneSayHi(@RequestParam String name) {
        return "this is client one , name : " + name;
    }

    @RequestMapping(value = "/one/foo", method = RequestMethod.GET)
    public String getFoo() {
        return "this is client one , foo  : " + foo;
    }
}
