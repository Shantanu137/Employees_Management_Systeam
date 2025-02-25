package com.cts.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleInvalidArgumentExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> map = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			map.put(error.getField(), error.getDefaultMessage());
		});
		return map;
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(ServiceOrderNotFoundException.class)
	public String handleServiceOrderNotFoundException(ServiceOrderNotFoundException ex) {
		String errorMessage = null;
		return errorMessage = ex.getLocalizedMessage();
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(EmployeeNotFoundException.class)
	public String handleEmployeeNotFoundException(EmployeeNotFoundException ex) {
		String errorMessage = null;
		return errorMessage = ex.getLocalizedMessage();
	}



	//@ResponseStatus(Employee.NOT_FOUND)
	@ExceptionHandler(EmployeeAlreadyExistException.class)
	public String handleEmployeeNotFoundException(EmployeeAlreadyExistException ex) {
		String errorMessage = null;
		return errorMessage = ex.getLocalizedMessage();
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(EmailIdAlreadyExistException.class)
	public String handleEmailIdAlreadyExistException(EmailIdAlreadyExistException ex) {
		String errorMessage = null;
		return errorMessage = ex.getLocalizedMessage();
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(PhoneNumberAlreadyExistException.class)
	public String handlePhoneNumberAlreadyExistException(PhoneNumberAlreadyExistException ex) {
		String errorMessage = null;
		return errorMessage = ex.getLocalizedMessage();
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(UserNameAlreadyExistException.class)
	public String handleUserNameAlreadyExistException(UserNameAlreadyExistException ex) {
		String errorMessage = null;
		return errorMessage = ex.getLocalizedMessage();
	}
	

}
