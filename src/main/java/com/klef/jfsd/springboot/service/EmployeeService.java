package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Employee;

public interface EmployeeService {
   public  String EmployeeRegistration(Employee emp);
    public Employee checkemplogin(String email, String password);  
    public  String updateemp(Employee e);
    public List<Employee> displayEmpByDepartment(String dept);
}
