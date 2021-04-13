package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping ("/a")
public String index(@RequestParam String firstname,@RequestParam String lastname){
    return " "+firstname+" "+lastname;
}
@RequestMapping("/dv")
public String defaulthello(@RequestParam(defaultValue = "John") String name){
        return "hej "+name;
}

}
