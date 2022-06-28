package com.medlow.springboot.service;

import com.medlow.springboot.model.User;
import com.medlow.springboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
