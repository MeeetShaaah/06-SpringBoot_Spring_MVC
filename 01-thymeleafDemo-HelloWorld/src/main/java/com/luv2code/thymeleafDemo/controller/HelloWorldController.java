package com.luv2code.thymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    //controller method to show initial form
    @RequestMapping("/showForm")
    public String showform(){
        return "hello-world-form";
    }

   //controller method to process the form
   @RequestMapping("/processForm")
   public String processForm(){
       return "helloworld";
   }
}
