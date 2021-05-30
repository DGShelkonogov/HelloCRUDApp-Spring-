package com.example.testcreator3;

import com.example.testcreator3.student.Student;
import com.example.testcreator3.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class TestCreator3Application {

    public static void main(String[] args) {
        SpringApplication.run(TestCreator3Application.class, args);
    }
}
