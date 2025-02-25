package com.cts.service;

import java.security.Principal;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.dto.UserDto;
import com.cts.entity.User;
import com.cts.exception.EmployeeAlreadyExistException;
import com.cts.exception.EmailIdAlreadyExistException;
import com.cts.exception.PhoneNumberAlreadyExistException;
import com.cts.exception.UserNameAlreadyExistException;

public interface UsersDetailsService {

	List<User> getAllEmployee();

	User updateEmployee(User signupDetails);

	public UserDetails loadUserByUsername(String username);

	public User adduser(User user) throws EmployeeAlreadyExistException, EmailIdAlreadyExistException,
			PhoneNumberAlreadyExistException, UserNameAlreadyExistException;

	User getUserById(long id);

}
