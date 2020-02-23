package com.sourabh.springbootexceptions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RollController {

    @RequestMapping("/rollAdd")
    public String addRoll() {
        var number = 10 / 0;
        return "add";
    }
}
