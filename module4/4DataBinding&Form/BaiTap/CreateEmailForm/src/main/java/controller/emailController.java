package controller;

import models.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class emailController {
    @GetMapping("/home")
    public ModelAndView getHomePage(Model model){
        List<Integer> sizePage = new ArrayList<>();
        List<String> languages = new ArrayList<>();
        sizePage.add(5);
        sizePage.add(10);
        sizePage.add(15);
        sizePage.add(25);
        sizePage.add(50);
        sizePage.add(100);

        languages.add("VietNamese");
        languages.add("Japanese");
        languages.add("Chines");
        languages.add("Korean");


        model.addAttribute("sizePage",sizePage);
        model.addAttribute("languages",languages);
        return new ModelAndView("formCreate","email",new Email());
    }

    @PostMapping("/result")
    public String getFormEmailCreate(@ModelAttribute Email email, Model model){
        model.addAttribute("email",email);
        return "result";
    }

    @GetMapping("/home")

}

