package com.StudentManagement.BeginnerStudentManagement.controller;

import com.StudentManagement.BeginnerStudentManagement.entity.Student;
import com.StudentManagement.BeginnerStudentManagement.service.StudentService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.module.ModuleDescriptor;

@Controller
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",service.getAllStudents());
        return "students";
    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        //create sutdent object to hold student form data
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        service.saveStudent(student);
        return "redirect:/students";
    }
}
