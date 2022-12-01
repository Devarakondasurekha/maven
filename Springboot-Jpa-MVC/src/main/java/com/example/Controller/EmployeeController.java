package com.example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.EmpService.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	public String viewHomePage(Model model) {
		model.addAttribute("Listemployees", es.getAllEmployees());
		return "index";
	}
}
