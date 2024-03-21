package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Department;
import com.cts.exception.DepartmentAlreadyExistException;
import com.cts.service.Impl.DepartmentServiceImpl;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentServiceImpl departmentServiceImpl;

	
	// Gating all Depatrment 
	@GetMapping("/Depatrment")
	public List<Department> getAllDepatrment() {

		return departmentServiceImpl.getAllDepartment();
	}

	//update Depatrment details
	@PatchMapping("/update")
	public Department  updatDepartment(@RequestBody Department details) {

		return departmentServiceImpl.updatDepartment(details);
	}
	// For create  new Department
	@PostMapping("/add-department")
	public ResponseEntity<Department> createAddDepartment(@RequestBody Department department) throws DepartmentAlreadyExistException {
		Department user1 = departmentServiceImpl.adddepartment(department);
		return new ResponseEntity<>(user1, HttpStatus.CREATED);

	}
}
