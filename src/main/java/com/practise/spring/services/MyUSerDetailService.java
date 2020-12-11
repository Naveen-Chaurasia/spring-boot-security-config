 package com.practise.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.practise.spring.dao.UserDao;
//import com.practise.spring.userdeatils.UserDetailImplimentation;


@Service
public class MyUSerDetailService implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		com.practise.spring.entities.User user=userDao.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("user 404");
		else 
			
		return new UserDetailImplimentation(user);
	}

}
