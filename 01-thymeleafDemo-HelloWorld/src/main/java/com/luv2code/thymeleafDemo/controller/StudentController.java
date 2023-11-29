package com.luv2code.thymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.luv2code.thymeleafDemo.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class StudentController {
    
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){
        
        //creating student object
         
        Student theStudent = new Student();

        //add that object to model
        theModel.addAttribute("student", theStudent); 
        
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        System.out.println("Student:" + theStudent.getFirstName() + ' ' + theStudent.getLastName());

        return "student-confirmation";
    }

}
