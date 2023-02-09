package com.StudentManagement.BeginnerStudentManagement.controller;

import com.StudentManagement.BeginnerStudentManagement.entity.Student;
import com.StudentManagement.BeginnerStudentManagement.service.StudentService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/students/edit/{id}")
    public String updateStudentForm(@PathVariable Long id,Model model){
        model.addAttribute("student",service.getStudentById(id));
        return "edit_student";
    }
    @PostMapping("/students/{id}")
    public String handleStudentUpdate(@PathVariable Long id ,@ModelAttribute("student") Student student, Model model){
        //Get student from database by id
        Student existingstudent = service.getStudentById(id);
        existingstudent.setId(id);
        existingstudent.setFirstName(student.getFirstName());
        existingstudent.setLastName(student.getLastName());
        existingstudent.setEmail(student.getEmail());

        //Save updated student object

        service.updateStudent(existingstudent);

        return "redirect:/students";
    }

    //handler method to handle delete student
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        service.deleteStudentById(id);
        return "redirect:/students";
    }
}
