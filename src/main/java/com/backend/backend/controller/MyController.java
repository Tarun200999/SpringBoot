package com.backend.backend.controller;
import com.backend.backend.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.PostMapping;
import com.backend.backend.entities.Courses;

import java.util.ArrayList;
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

    @GetMapping("/courses/{courseId}")
    public Courses getSingleCourses(@PathVariable String courseId){
        Courses result=courseServices.getSingleCourse(Long.parseLong(courseId));
        return result;
    }

    @PostMapping(path = "/courses",consumes = "application/json")
    public Courses addCourse(@RequestBody Courses course){
        return courseServices.addCourse(course);
    }
}
