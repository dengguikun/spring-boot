package com.gaken.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author dengguikun
 * @Date 2018-12-26 09:46
 **/
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String hello(){
    return "hello ~~~ i am hello method!";
    }
}
