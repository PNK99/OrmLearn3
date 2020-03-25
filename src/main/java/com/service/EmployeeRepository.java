package com.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select e from employee where e.permanent=1")
	public List<Employee> getPermanentEmployee();

	@Query(value = "SELECT e FROM Employee e left join fetch e.department d left join "
			+ "fetch e.skillList WHERE e.permanent = 1")
	public List<Employee> getPermEmployees();
	
	@Query(value="SELECT AVG(e.salary) FROM Employee e")
	public   double getAverageSalary();

	@Query(value="SELECT AVG(e.salary) FROM Employee e where e.department.id = :id")
	double getAverageSalary( int id);
	
    @Query(value="SELECT * FROM employee", nativeQuery = true)
    List<Employee> getAllEmployeesNative();


}
