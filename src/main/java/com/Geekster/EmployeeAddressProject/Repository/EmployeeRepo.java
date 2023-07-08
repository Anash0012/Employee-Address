package com.Geekster.EmployeeAddressProject.Repository;

import com.Geekster.EmployeeAddressProject.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee,Long> {
}
