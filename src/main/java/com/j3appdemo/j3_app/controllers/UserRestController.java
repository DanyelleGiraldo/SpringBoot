package com.j3appdemo.j3_app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j3appdemo.j3_app.models.User;
import com.j3appdemo.j3_app.models.dto.UserDto;




@RestController
@RequestMapping("/v2/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Danyelle", "Giraldo", "danyellesgiraldoj@gmail.com");
        userDto.setTitle("Desarrollando con spring:D");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/list-details")
    public List<User> listdetails() {
        User user = new User("Danilo", "Jimenez", "");
        User userA = new User("Juan", "Tinoco", "" );
        User userB = new User("Dylan","Giraldo", "");
        List<User> lstUsers= new ArrayList<>();
        lstUsers.add(user);
        lstUsers.add(userA);
        lstUsers.add(userB);
        return lstUsers;
    }
    
    

    // @GetMapping("/details")
    // public Map<String,Object> details(){
    //     User user = new User("Danyelle", "Giraldo");
    //     Map<String,Object> body = new HashMap<>();
    //     body.put("title", "Desarrollando con Spring boot CreativeCode");
    //     body.put("user", user);
    //     return body;
    // }    
}
