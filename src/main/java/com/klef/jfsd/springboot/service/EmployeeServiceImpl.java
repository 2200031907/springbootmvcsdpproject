package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String EmployeeRegistration(Employee emp) {
        // Implementation for employee registration
        return "Employee Registered Successfully";
    }

    @Override
    public Employee checkemplogin(String email, String password) {
        return employeeRepository.checkemplogin(email, password);
    }

    @Override
    public String updateemp(Employee e) {
        Employee emp = employeeRepository.findById(e.getId()).orElse(null);
        
        if (emp != null) {
            emp.setContact(e.getContact());
            emp.setDateofbirth(e.getDateofbirth());
            emp.setDepartment(e.getDepartment());
            emp.setGender(e.getGender());
            emp.setLocation(e.getLocation());
            emp.setName(e.getName());
            emp.setPassword(e.getPassword());
            emp.setSalary(e.getSalary());
            
            employeeRepository.save(emp);
            return "Employee details updated successfully";
        } else {
            return "Employee not found";
        }
    }

	@Override
	public List<Employee> displayEmpByDepartment(String dept) {
		
		return employeeRepository.findByDepartment(dept);
	}
}
