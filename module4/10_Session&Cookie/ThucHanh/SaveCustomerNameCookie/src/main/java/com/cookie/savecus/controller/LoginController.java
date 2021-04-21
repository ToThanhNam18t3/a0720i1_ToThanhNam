package com.cookie.savecus.controller;

import com.cookie.savecus.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class LoginController {

    @ModelAttribute("user")
    public User setUpUserForm(){
        return new User();
    };

    @RequestMapping("/login")
    public String Index(@CookieValue(value = "setUser", defaultValue = "") String setUser, Model model) {
        Cookie cookie = new Cookie("setUser", setUser);
        model.addAttribute("cookieValue", cookie);
        return "login";
    }

    @PostMapping("/dologin")
    public String doLogin(@ModelAttribute("user") User user, @CookieValue(value="setUser", defaultValue = "") String setUser,
                          HttpServletResponse response, HttpServletRequest request){
        if(user.getEmail().equals("tothanhnam@gmail.com") && user.getPassword().equals("1234")){
            if(user.getEmail() != null)
                setUser = user.getEmail();

            //create mew cppploe
            Cookie cookie = new Cookie("setUser", setUser);
            cookie.setMaxAge(120);
            response.addCookie(cookie);

            //Get A;; Cpppl
            Cookie[] cookies = request.getCookies();

            for(Cookie ck:cookies){
                
            }
        }
    }

    

}
