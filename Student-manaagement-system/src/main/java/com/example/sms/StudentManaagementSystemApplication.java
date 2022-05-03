package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManaagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManaagementSystemApplication.class, args);
	}
    
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student studen1=new Student("Ramesh","Patil","Ramesh@12hmail.com");
//		studentRepository.save(studen1);
//		Student studen2=new Student("Ganesh","Jadhav","ganesh123@gmail.com");
//		studentRepository.save(studen2);
//		
		
	}

}
