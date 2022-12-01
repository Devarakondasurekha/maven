package com.example.EmpService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EmpEntity.Employee;
import com.example.EmpRepo.EmployeeRepository;

@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository er;
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	
}
