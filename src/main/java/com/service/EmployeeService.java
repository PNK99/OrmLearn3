package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Employee;

@Service
public class EmployeeService {
	@Autowired
private EmployeeRepository employeeRepository;
@Transactional
public void save(Employee emp) {
	employeeRepository.save(emp);
}
@Transactional
public Employee get(Integer id) {
	return employeeRepository.findById(id).get();
}


}
