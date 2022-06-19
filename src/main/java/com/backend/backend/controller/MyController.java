package com.backend.backend.controller;
import com.backend.backend.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.backend.entities.Courses;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseServices courseServices;

    @GetMapping("/test")
    public String testApp(){
        return "Spring Boot Application is Working";
    }

    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return courseServices.getCourses();
    }
}
