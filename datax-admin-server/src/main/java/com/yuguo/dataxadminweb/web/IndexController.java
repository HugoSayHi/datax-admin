package com.yuguo.dataxadminweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: IndexController
 * @Authors: yuguo
 * @Date: 2019/6/18
 * @Description:
 **/
@Controller
public class IndexController {

    @RequestMapping(value = "index")
    public String index_(){
        return "index";
    }
}
