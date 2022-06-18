package com.backend.backend.services;

import com.backend.backend.entities.Courses;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseServiceImpl implements CourseServices{
    List<Courses> list;

    public CourseServiceImpl() {
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
