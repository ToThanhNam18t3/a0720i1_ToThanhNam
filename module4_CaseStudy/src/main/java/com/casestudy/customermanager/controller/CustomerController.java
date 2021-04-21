package com.casestudy.customermanager.controller;


import com.casestudy.customermanager.services.customerService.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"/customer"})
public class CustomerController {

    @Autowired
    CustomerService customerService;

//    @GetMapping("")
//    public ModelAndView customerHome(){
//        return new ModelAndView("html/customer");
//    }

    @GetMapping("")
    public ModelAndView getListPageable(@PageableDefault(size = 5) Pageable pageable){
        return new ModelAndView("html/customer","customers", customerService.findAll(pageable));
    }



}
