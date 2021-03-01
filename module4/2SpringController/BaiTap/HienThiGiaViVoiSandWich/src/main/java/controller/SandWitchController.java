package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWitchController {
    @GetMapping("/index") //Url /index allow for access
    public String getView() {
        return "saveCondiment";
    } // return save Condiment from views/JSP

    @RequestMapping(value = "/saveCondiment", method = RequestMethod.POST) // Mapping and get value from JSP
    public String save(@RequestParam(value = "condiment", defaultValue = "") String[] condiment, Model model) {
        String message = "";
        for (String i : condiment) {
            message += i + ", " ;
        }
        model.addAttribute("message", message);
        return "saveCondiment";
    }
}
