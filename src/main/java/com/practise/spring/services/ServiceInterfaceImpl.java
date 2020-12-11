package com.practise.spring.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.spring.dao.CourseDao;
import com.practise.spring.entities.Course;


@Service
public class ServiceInterfaceImpl implements ServiceInterface {

//	List<Course> list = new ArrayList<>();
//
//	public serviceInterfaceImpl(List<Course> list) {
//		list.add(new Course(145, "JAVA CORE COURSE", "This course contains basics of java"));
//		list.add(new Course(146, "Python", "Python description"));
//	}
	@Autowired
	private CourseDao courseDao;
	

	@Override
	public List<Course> allCourses() {
		// TODO Auto-generated method stub
		//return list;
		return courseDao.findAll();
	}
	
	

	@Override
	public Course showCourse(long id) {
//		Course c = null;
//		for (Course course : list) {
//			if (course.getId() == id) {
//				c = course;
//			}
//		}
//		return c;
		
		return courseDao.getOne(id);
	}

	
	
	@Override
	public Course addCourse(Course c) {
//		list.add(new Course(147, "c++", "c++description"));
//		return null;
		
		courseDao.save(c);
		return c;
		
	}

	
	
	@Override
	public void deleteCourse(long parseLong) {
	//	list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
	Course entity = courseDao.getOne(parseLong);
	courseDao.delete(entity);
	}

	
	
	@Override
	public Course updateCourse(Course c) {
//		list.forEach(e -> {
//			if (e.getId() == c.getId())
//
//			{
//				e.setTitle(c.getTitle());
//				e.setDescription(c.getDescription());
//			}
//
//		});
		
		courseDao.save(c);

		return c;
	}
	
	

}
