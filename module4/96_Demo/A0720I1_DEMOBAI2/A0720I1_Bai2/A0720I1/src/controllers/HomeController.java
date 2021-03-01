package controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView getHomePage(){
        return new ModelAndView("home");
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String username, @RequestParam String password, Model model){
        if ("trungdoan".equals(username) && "123123".equals(password)){
            model.addAttribute("message", "Login success");
            System.out.println(username);
            return "result";
        }else {
            return "home";
        }
    }

    @GetMapping("/product/{id}")
    public ModelAndView getProductDetail(@PathVariable int id){
        System.out.println(id);
        return new ModelAndView("home");
    }
}
