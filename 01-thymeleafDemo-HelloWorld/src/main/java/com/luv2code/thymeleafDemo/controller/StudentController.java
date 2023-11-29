package com.luv2code.thymeleafDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.luv2code.thymeleafDemo.model.Student;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StudentController {

    // Add list of countries from application.properties directly,

    @Value("${countries}")
    private List<String> countries;

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){
        
        //creating student object
         
        Student theStudent = new Student();

        //add that object to model
        theModel.addAttribute("student", theStudent); 

        // add the list of countries into the model 
        theModel.addAttribute("countries", countries);
        
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        System.out.println("Student:" + theStudent.getFirstName() + ' ' + theStudent.getLastName());

        return "student-confirmation";
    }

}
