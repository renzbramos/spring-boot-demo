package com.xenergy.demo.controller.rest;

import com.xenergy.demo.entity.Class;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClassRC {

//    @GetMapping("/hello")
//    public String helloWorld(@RequestParam("id") String value, @RequestParam("language") String language){
//        return "Hello " + value + " " + language;
//    }

    @DeleteMapping("/hello")
    public String helloDelete(){
        return "This is Delete";
    }

    @PutMapping("/hello")
    public String helloPUT(){
        return "This is PUT";
    }

    private List<Class> classList = new ArrayList<>();

    @GetMapping("/class")
    public List<Class> showClassRecord(){
        return classList;
    }

    @PostMapping("/class")
    public String saveClassRecord(@RequestBody Class classes){
        classList.add(classes);
        return "Saved";
    }

}
