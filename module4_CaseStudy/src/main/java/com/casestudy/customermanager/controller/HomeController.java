package com.casestudy.customermanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"/home","/"})
public class HomeController {

    @GetMapping("")
    public ModelAndView homePage(){
        return new ModelAndView("html/home");
    }

}
