package com.example.demo.controller.qqcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lsm on 2017/8/11.
 */
@Controller
@RequestMapping(value = "/v1")
public class TestQQController {
    @RequestMapping(value = "/qqlogin",method = RequestMethod.GET)
    public String login(){

        return "";
    }
}
