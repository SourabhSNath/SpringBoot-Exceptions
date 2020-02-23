package com.sourabh.springbootexceptions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/add")
    public String add() {
        var c = 10 / 0;
        return "add";
    }

    @RequestMapping("/update")
    public String enter() {
        String word = null;
        word = word.toLowerCase();
        return "add";
    }

//    @ExceptionHandler(value = {ArithmeticException.class})
//    public ModelAndView handlerArithmeticException(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", e.toString());
//        modelAndView.setViewName("matherror");
//        return modelAndView;
//    }
//
//    @ExceptionHandler(value = {NullPointerException.class})
//    public ModelAndView handlerNullPointerException(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", e.toString());
//        modelAndView.setViewName("nullError");
//        return modelAndView;
//    }

}
