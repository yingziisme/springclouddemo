package com.mt.demo.feignclienttwo.demo;

import org.springframework.beans.factory.annotation.Autowired;
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
    private OneService oneService;


    @RequestMapping(value = "/two/sayhione", method = RequestMethod.GET)
    public String clientOneSayHiTwo(@RequestParam String name) {
        return oneService.sayHiFromClientTwo(name);
    }

    @RequestMapping(value = "/two/sayhi", method = RequestMethod.GET)
    public String clientTwoSayHi(@RequestParam String name) {
        return "this is client twooooo , name : " + name;
    }
}
