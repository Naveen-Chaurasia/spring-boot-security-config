package com.practise.spring.services;

import java.util.List;

import com.practise.spring.entities.Course;

public interface ServiceInterface {
	
	
	public List<Course> allCourses();
	public Course showCourse(long id);
	public Course addCourse(Course c);
    public void deleteCourse(long id);
	public Course updateCourse(Course c);

}
