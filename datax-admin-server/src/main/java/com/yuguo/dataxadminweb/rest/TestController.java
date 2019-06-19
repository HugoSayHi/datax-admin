package com.yuguo.dataxadminweb.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: TestController
 * @Authors: yuguo
 * @Date: 2019/6/17
 * @Description:
 **/
@RestController
@RequestMapping(path = "test")
public class TestController {

    @RequestMapping(path = "index.do")
    public String test(){
        return "hello world";
    }



}
