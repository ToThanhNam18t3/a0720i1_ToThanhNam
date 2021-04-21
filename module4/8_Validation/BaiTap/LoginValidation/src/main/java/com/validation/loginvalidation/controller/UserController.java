package com.validation.loginvalidation.controller;

import com.validation.loginvalidation.model.User;
import com.validation.loginvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("User", new User());
        return "index";
    }

    @PostMapping("/")
    public String checkValidation(@Valid @ModelAttribute("User") User user, BindingResult bindingResult, Model model) {
        new User().validate(user, bindingResult);

        if (bindingResult.hasErrors()) {
            return "index";
        } else {
            model.addAttribute("User", user);
            userService.save(user);
            return "result";
        }
    }


}
