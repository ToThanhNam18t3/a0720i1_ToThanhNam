package com.casestudy.customermanager.controller;


import com.casestudy.customermanager.model.customer.Customer;
import com.casestudy.customermanager.services.customerService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.validation.Valid;

@Controller
@RequestMapping(value = {"/customer"})
public class CustomerController {

    @Autowired
    CustomerService customerService;

//    @RequestMapping("/page/{pagenum}")
//    public String viewPage(Model model ,
//                           @PathVariable(name="pagenum") int pagenum){
//        Page<Customer> page = customerService.findAll(pagenum);
//
//
//    }

    @GetMapping("")
    public String searchCustomerByName(@RequestParam(value = "page" , defaultValue = "0") int page,
                                    @RequestParam(value = "inputSearch" , defaultValue = "") String inputSearch ,
                                    @RequestParam(value = "nameSort" , defaultValue = "") String nameSort,
                                    Model model
                                    ){


        Pageable sortByName;
        if (nameSort.equals("")){
            sortByName = PageRequest.of(page, 5);
        } else {
            sortByName = PageRequest.of(page, 5 , Sort.by(nameSort).ascending());
        }

        model.addAttribute("inputSearch" , inputSearch);
        model.addAttribute("customers" , customerService.findCustomerByCustomerName(sortByName, inputSearch));
        model.addAttribute("nameSort" , nameSort);
        return "html/customer";
    }


    @GetMapping("/create")
    public ModelAndView createForm(Model model){
        model.addAttribute("customertypes", customerService.findAllCustomerType());
        return new ModelAndView("html/create", "customer", new Customer());
    }

    @PostMapping("/create")
    public String createCustomer(@Valid @ModelAttribute("customer") Customer customer , BindingResult bindingResult , Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("customertypes", customerService.findAllCustomerType());
            return "html/create";
        } else {
            model.addAttribute("customer" , customer.getCustomerId());
            customerService.save(customer);
        }
        return "redirect:/customer/";
    }

//    @PostMapping("/create")
//    public String createCustomer(@Valid @ModelAttribute("customer") Customer customer){
//        customerService.save(customer);
//        return "redirect:/";
//    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEdit(@PathVariable int id , Model model){
        model.addAttribute("customertypes", customerService.findAllCustomerType());
        return new ModelAndView("html/edit", "customer" , customerService.findById(id));
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        return "redirect:";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable String id, Model model){
        customerService.delete(id);
        return "redirect:/customer/";
    }


}
