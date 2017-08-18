package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lsm on 2017/8/10.
 */
@Controller
@RequestMapping("/v1")
public class TestController {
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }

}
