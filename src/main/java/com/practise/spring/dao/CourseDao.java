package com.practise.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.spring.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long> {

}
