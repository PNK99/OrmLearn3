package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Department;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Transactional
	public void save(Department dept) {
		departmentRepository.save(dept);
	}
	@Transactional
	public Department get(Integer id) {
		return departmentRepository.findById(id).get();
	}

}
