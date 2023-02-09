package com.StudentManagement.BeginnerStudentManagement.service;

import com.StudentManagement.BeginnerStudentManagement.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
