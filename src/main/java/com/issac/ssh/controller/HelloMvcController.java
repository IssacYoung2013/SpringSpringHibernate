package com.issac.ssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * author:  ywy
 * date:  2018-06-25
 * desc:
 *
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {

    @RequestMapping("/mvc")
    public String helloMvc(){
        return "home";
    }
}