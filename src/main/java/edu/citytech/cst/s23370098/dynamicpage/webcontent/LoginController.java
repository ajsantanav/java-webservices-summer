package edu.citytech.cst.s23370098.dynamicpage.webcontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        System.out.println(this.getClass().getName());
        return "/login";
    }

    @GetMapping("/logout")
    public String logout() {
        System.out.println(this.getClass().getName() + ".logout");
        return "/logout";
    }
}