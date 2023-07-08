package com.Geekster.EmployeeAddressProject.Service;

import com.Geekster.EmployeeAddressProject.Model.Address;
import com.Geekster.EmployeeAddressProject.Model.Employee;
import com.Geekster.EmployeeAddressProject.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }

    public String addEmployees(List<Employee> employeeList) {
        employeeRepo.saveAll(employeeList);
        return "employees added successfully."+employeeList;
    }

    public String updateEmployeeById(Long id, Address address) {
        Optional<Employee> employeeOptional = employeeRepo.findById(id);
        if(employeeOptional==null){
            return "id not found";
        }
        Employee employee = employeeOptional.get();
        employee.setAddress(address);
        employeeRepo.save(employee);
        return "address updated successfully";



    }

    public String deleteEmployeeById(Long id) {
        employeeRepo.deleteById(id);
        return "employee deleted successfully";
    }
}
