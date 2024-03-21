package com.cts.service;

import java.util.List;

import com.cts.entity.Department;
import com.cts.exception.DepartmentAlreadyExistException;

public interface DepartmentService {
	// function for getting all department
	List<Department> getAllDepartment();
	
	//updating department
	Department updatDepartment(Department details);
	
	//Adding Department
	public Department adddepartment(Department department) throws DepartmentAlreadyExistException;

   //  department by id
    Department getDepartmentById(long dId);
	

}
