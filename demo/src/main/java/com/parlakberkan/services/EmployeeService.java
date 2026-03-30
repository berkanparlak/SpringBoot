package com.parlakberkan.services;


import com.parlakberkan.model.Employee;
import com.parlakberkan.model.UpdateEmployeeRequest;
import com.parlakberkan.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getALlEmployeeList(){
        return employeeRepository.getAllEmployeeList();
    }

    public Employee getEmployeeById(String id){
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName){
        return employeeRepository.getEmployeeWithParams(firstName,lastName);
    }
    public Employee saveEmployee (Employee newEmployee){
        return employeeRepository.saveEmployee(newEmployee);
    }
    public boolean deleteEmployee (String id){
        return employeeRepository.deleteEmployee(id);
    }
    public Employee updateEmployee(String id, UpdateEmployeeRequest request){
        return employeeRepository.updateEmployee(id,request);
    }

}
