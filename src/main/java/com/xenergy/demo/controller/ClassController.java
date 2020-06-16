package com.xenergy.demo.controller;

import com.xenergy.demo.services.impl.ClassImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/class/")
public class ClassController {

    @Autowired
    private ClassImpl classService;

    @GetMapping("index")
    public ModelAndView showClassIndexPage(){
        ModelAndView modelAndView = new ModelAndView("index");

        modelAndView.addObject("className","Xen Energy");
        modelAndView.addObject("oneClass", classService.findById(1));
        modelAndView.addObject("classes", classService.findAll());

        return modelAndView;
    }

}
