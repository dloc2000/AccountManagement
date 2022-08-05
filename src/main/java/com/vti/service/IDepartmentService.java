package com.vti.service;

import java.util.List;

import com.vti.entity.Department;

public interface IDepartmentService {
	public List<Department> getAllDepartment();
	
	public Department findByName(String name);
}
