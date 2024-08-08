package com.j3appdemo.j3_app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.j3appdemo.j3_app.models.User;


@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Daniel","Giraldo", "");
        user.setEmail("danyellesgiraldoj@gmail.com");
        model.addAttribute("title", "Hola");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/form")
    public String submitUser(@RequestParam String nombre, 
                             @RequestParam String apellido, 
                             @RequestParam(required = false) String email, 
                             Model model) {
        User user = new User(nombre, apellido, email);
        model.addAttribute("user", user);
        return "form";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
            new User("Danilo", "Giraldo", "danyelle@gmail.com"),
            new User("Martha", "Sanchez", "martha@gmail.com"),
            new User("Vicente", "camargo","vicente@gmail.com"),
            new User("Danyelle", "Giraldo")
        );
        model.addAttribute("title", "Listado de usuarios");
        model.addAttribute("users", users);
        return "list";
    }
    

}
