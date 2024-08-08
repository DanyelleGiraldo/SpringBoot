package com.j3appdemo.j3_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j3appdemo.j3_app.models.ParamsDto;


@RestController
@RequestMapping("/api/denovar")
public class PathVariableController {
    @GetMapping("/saludo/{mensaje}")
    public ParamsDto saludo(@PathVariable String Message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(Message);
        return param;
    }
    
}
