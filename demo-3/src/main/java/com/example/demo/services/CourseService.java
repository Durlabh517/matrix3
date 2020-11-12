package com.example.demo.services;
import com.example.demo.entities.*;
import java.util.List;

public interface CourseService  {
 public List<Course> getCourses();
 
public Course getCourse(long courseId);



public Course addCourse(Course course);
}
