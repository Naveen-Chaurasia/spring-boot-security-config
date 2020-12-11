package com.practise.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practise.spring.entities.Course;
import com.practise.spring.services.ServiceInterface;

@RestController
public class Controller {
	@Autowired
	private ServiceInterface service;
	@GetMapping("/home")
	public String home()
	{
		return "welcome to my application";
	}
		
	@GetMapping("/courses")
	public List<Course> course()
	{
	return this.service.allCourses();	
	}
	
	@GetMapping("/course/{courseid}")
	
	public Course showCourse(@PathVariable String  courseid)
	
	{
		return this.service.showCourse(Long.parseLong(courseid));
	}

	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course)
	{
		return this.service.addCourse(course);
	}
	

	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable Long id)
	{
		 this.service.deleteCourse(id);
	}
	@PutMapping("/course")
	public Course deleteCourse(@RequestBody Course c)
	{
		return this.service.updateCourse(c);
	}

}
