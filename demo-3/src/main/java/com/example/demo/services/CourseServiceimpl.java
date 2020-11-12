package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;


@Service
public class CourseServiceimpl implements CourseService {

	List<Course> list;
	public CourseServiceimpl() {
		list=new ArrayList<>();
		list.add(new Course(0, "hari","sdfsf"));
		list.add(new Course(1, "sita","sdfsf"));
		
			
		
	}
	@Override
	public List<Course>getCourses(){
		return list;
	};
public Course getCourse(long courseId) {
	Course c=null;
	for(Course course:list) {
		c=course;
		break;
	}
	return c;
}

public Course addCourse(Course course) {
	list.add(course);
	return course;
}
}
