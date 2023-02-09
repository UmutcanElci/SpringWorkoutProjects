package com.StudentManagement.BeginnerStudentManagement.impl;

import com.StudentManagement.BeginnerStudentManagement.entity.Student;
import com.StudentManagement.BeginnerStudentManagement.repository.StudentRepository;
import com.StudentManagement.BeginnerStudentManagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
