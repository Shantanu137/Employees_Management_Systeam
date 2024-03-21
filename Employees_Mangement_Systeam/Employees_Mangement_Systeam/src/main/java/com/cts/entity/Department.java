package com.cts.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name ="Department")
public class Department {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long departmentId;
	
	@NotBlank(message = "Department Name is mandatory field")
	@Size(min = 5,max=50,message = "Department Name shall be between 5 and 50 chars in length")
	
	private String departmentName;


	
}
