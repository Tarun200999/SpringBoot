package com.backend.backend.services;

import com.backend.backend.entities.Courses;
import com.backend.backend.services.CourseServiceImpls;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpls implements CourseServices{
    List<Courses> list;

    public CourseServiceImpls() {
        list=new ArrayList<>();

        list.add(new Courses(1,"Tarun","Description"));
        list.add(new Courses(1,"Varun","Description"));
        list.add(new Courses(1,"Harun","Description"));
        list.add(new Courses(1,"Jarun","Description"));
        list.add(new Courses(1,"Karun","Description"));
        list.add(new Courses(1,"Larun","Description"));
        list.add(new Courses(1,"Oarun","Description"));
        list.add(new Courses(1,"Marun","Description"));

    }

    @Override
    public List<Courses> getCourses() {
        return list;
    }
}
