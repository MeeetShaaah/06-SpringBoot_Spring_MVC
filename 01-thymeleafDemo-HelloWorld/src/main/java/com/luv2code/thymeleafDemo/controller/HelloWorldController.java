package com.luv2code.thymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

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

    //-------Code for creating model and read data from Form via controller and pass this data to model to view tamplete-------

   @RequestMapping("/processFormVtwo")
   public String letsShout(HttpServletRequest request, Model model){

    //read the request parameter....
    String theName = request.getParameter("studentName");
    
    // change the data to uppercase
    theName = theName.toUpperCase();

    // create the message, simply this message is kinda of varible of model where we assign our data and latter in view tamplete we can  use this model variable...
    String result = "Yo! "+ theName;

    // pass the message to model
    model.addAttribute("message",result);

    return "helloworld";
   }

   // Read and bind the data from Form with using @RequesParam which helps to directly read the data and pass that data to model message variable 

   @RequestMapping("/processFormVthree")
   public String letsShoutTwo(@RequestParam("studentName") String theName, Model model){

    theName=theName.toUpperCase();
    
    String result = "This is the message using @RequestParam " + theName;

    model.addAttribute("message", result);

    return "helloworld";
   }
}
