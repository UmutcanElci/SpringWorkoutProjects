package com.StudentManagement.BeginnerStudentManagement;

import com.StudentManagement.BeginnerStudentManagement.entity.Student;
import com.StudentManagement.BeginnerStudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeginnerStudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BeginnerStudentManagementApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Umut","Elci","UMUt@oyutlook.com");
		studentRepository.save(student1);
		Student student2 = new Student("Can", "Bra","Brau@mail.com");
		studentRepository.save(student2);
		Student student3 = new Student("Frank", "Mitch","Frankuu@mail.com");
		studentRepository.save(student3);

		 */
	}
}
