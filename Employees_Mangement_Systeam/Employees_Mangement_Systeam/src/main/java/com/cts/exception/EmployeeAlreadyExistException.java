package com.cts.exception;


public class EmployeeAlreadyExistException extends RuntimeException {
	private String message;
	private static final long serialVersionUID = 1L;

	public EmployeeAlreadyExistException(String msg) {
		super(msg);
		this.message = msg;
	}

}
