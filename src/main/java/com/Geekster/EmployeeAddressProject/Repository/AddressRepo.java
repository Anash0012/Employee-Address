package com.Geekster.EmployeeAddressProject.Repository;

import com.Geekster.EmployeeAddressProject.Model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Long> {

}
