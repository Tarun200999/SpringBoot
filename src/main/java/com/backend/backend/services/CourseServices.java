package com.backend.backend.services;

import com.backend.backend.entities.Courses;

import java.util.List;

public interface CourseServices {

    public List<Courses> getCourses();

    public Courses getSingleCourse(long courseId);

    public Courses addCourse(Courses course);


    public Courses updateCourse(Courses course);


    public long deleteCourse(long courseId);
}
