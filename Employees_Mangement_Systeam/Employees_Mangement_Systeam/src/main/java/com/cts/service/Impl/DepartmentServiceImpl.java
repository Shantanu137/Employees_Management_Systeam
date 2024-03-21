package com.cts.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Department;
import com.cts.exception.DepartmentAlreadyExistException;
import com.cts.exception.DepartmentNotFoundException;
import com.cts.respository.DepatrmentRepository;
import com.cts.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepatrmentRepository repository;

	@Override
	public List<Department> getAllDepartment() {
		
		
		// TODO Auto-generated method stub
		return repository.findAll();	}

	@Override
	public Department updatDepartment(Department details) {
		// TODO Auto-generated method stub
		Department department = repository.getById((long) details.getDepartmentId());
		if(department.equals(null)) {
			throw new DepartmentNotFoundException("Department not found :"+ details.getDepartmentId());
		}
		department.setDepartmentId(details.getDepartmentId());
		department.setDepartmentName(details.getDepartmentName());
		return repository.save(department);
	}



	@Override
	public Department adddepartment(Department department) throws DepartmentAlreadyExistException {
		// TODO Auto-generated method stub
		Department exisitngDepartmentId = repository.findById(department.getDepartmentId()).orElse(null);
		Department exisitingDepartmenrName = repository.findByDepartmentName(department.getDepartmentName()).orElse(null);
		if(exisitngDepartmentId == null && exisitingDepartmenrName==null) {
			
		repository.save(department);
		return repository.save(department);
		}
		else throw new DepartmentAlreadyExistException("Department already exists !!");
	}
	

	@Override
	public Department getDepartmentById(long dId) {
		// TODO Auto-generated method stub
		return repository.findById(dId).orElse(null);
	}



}
