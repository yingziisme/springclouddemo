package com.mt.demo.zuul.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * WebController
 *
 * @author MT.LUO
 * 2018/5/31 11:17
 * @Description:
 */
@RestController
public class WebController {
    @RequestMapping(value = "/zzzz/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return "this is zull , name: " + name;
    }
}
