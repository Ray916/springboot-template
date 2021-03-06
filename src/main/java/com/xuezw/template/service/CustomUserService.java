package com.xuezw.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.xuezw.template.dao.SysUserRepository;
import com.xuezw.template.domain.SysUser;

public class CustomUserService implements UserDetailsService {

	@Autowired
	SysUserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		SysUser user = userRepository.findByUsername(username);
		System.out.println(user.toString());
		return user;
	}

}
