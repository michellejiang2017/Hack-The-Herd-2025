package com.wheelymammoth.model.controller;

import com.example.demo.model.User; // make sure you have a User class
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "home";  // maps to home.html
    }

    @GetMapping("/rides")
    public String ridesPage(Model model) {
        // Placeholder list of rides
        model.addAttribute("rides", new ArrayList<>()); 
        return "rides"; // maps to rides.html
    }

    @GetMapping("/users/profile")
    public String profilePage(Model model) {
        // Placeholder user
        User user = new User();
        user.setName("Jane Doe");
        user.setEmail("jane@example.com");
        user.setRole("rider");
        model.addAttribute("user", user);
        return "profile"; // maps to profile.html
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // maps to login.html
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register"; // maps to register.html
    }
}
