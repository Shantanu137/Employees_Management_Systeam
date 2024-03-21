package com.cts.exception;

public class DepartmentNotFoundException extends RuntimeException {
	private String message;

	public DepartmentNotFoundException(String msg) {
		super(msg);
		this.message = msg;
	

}
}
