package com.cts.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Department;

@Repository
public interface DepatrmentRepository extends JpaRepository<Department, Long> {

	Optional<Department> findByDepartmentName(String department);
}
