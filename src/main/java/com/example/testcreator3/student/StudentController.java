package com.example.testcreator3.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students")
    public Iterable<Student> getAllPost(){return studentService.getAllStudent();}

    @RequestMapping(value = "/students/{Id}")
    public Optional<Student> getStudent(@PathVariable String Id){
        return studentService.getStudent(Id);
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @RequestMapping(value = "/students/{Id}" , method = RequestMethod.PUT)
    public void updateStudent(@PathVariable ("Id") String id,
                               @RequestBody Student student){
        studentService.addStudent(id, student);
    }

    @RequestMapping(value = "/students/{Id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable ("Id") String id){
        studentService.deleteStudent(id);
    }

}
