package com.practise.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.spring.entities.User;

//import com.practise.spring.entities.User;
//import org.springframework.security.core.userdetails.User;




public interface UserDao extends JpaRepository<User,Long> {
	
User findByUsername(String username);

}
