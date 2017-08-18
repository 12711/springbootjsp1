package com.example.demo.controller.qqcontroller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lsm on 2017/8/11.
 */
@Controller
@RequestMapping(value = "/v1")
public class IndexController {
    @RequestMapping(value = "/toqqlogin",method = RequestMethod.GET)
    public String toQQLogin(){
        System.out.println("0000000000000000000000000");
        return "redirect:https://graph.qq.com/";
    }

}
