package com.springrest.spring.services;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.springrest.spring.dao.CourseDao;
import com.springrest.spring.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {
	List<Course> list;

//	@Autowired
//	private CourseDao courseDao;

	public CourseServiceimpl() {
		
		  list = new ArrayList<>(); list.add(new Course(145, "JAVA CORE COURSE",
		  "This course contains basics of java")); list.add(new Course(165,
		  "SPRING BOOT COURSE", "basics of creating REST API"));
		 
	}

	@Override
	public List<Course> getCourses() {
		 return list;
		//return courseDao.findAll();
	}

	public Course getCourse(long courseId) {

		
		  Course c = null; for (Course course : list) { if (course.getId() == courseId)
		  { c = course; break; } }
		  
		  return c;
		 

		//return courseDao.getOne(courseId);
	}

	public Course addCourse(Course course) {
		
		  list.add(course); return course;
		 

//		courseDao.save(course);
//		return course;
	}

	@Override
	public Course updateCourse(Course course) {

		
		  list.forEach(e -> { if (e.getId() == course.getId()) {
		  e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
		  }); return course;
		 

//		courseDao.save(course);
//		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		 list = this.list.stream().filter(e -> e.getId() !=
		 parseLong).collect(Collectors.toList());
//		Course entity = courseDao.getOne(parseLong);
//		courseDao.delete(entity);
	}

}
