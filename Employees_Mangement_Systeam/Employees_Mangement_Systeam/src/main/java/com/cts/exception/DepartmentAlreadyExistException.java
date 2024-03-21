package com.cts.exception;

public class DepartmentAlreadyExistException extends RuntimeException {
	private String message;

	public DepartmentAlreadyExistException(String msg) {
		super(msg);
		this.message = msg;
	
	}
}
