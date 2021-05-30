package com.example.testcreator3.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void testStudentRepository(){
        Optional<Student> studentOptional = studentRepository.findById(1L);
        Optional<Student> studentOptional1 =
                studentRepository.findByFirstNameAndLastName("N1", "LN2");
    }



    public Iterable<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(String id){
        return studentRepository.findById(Long.parseLong(id));
    }
    public void addStudent(Student student){
         studentRepository.save(student);
    }

    public void addStudent(String id, Student student){
        Student student1 = getStudent(id).get();
        student1.setEmail(student.getEmail());
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        studentRepository.save(student1);
    }

    public void deleteStudent(String id){
        studentRepository.deleteById(Long.parseLong(id));
    }
}
