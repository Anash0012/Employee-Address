package com.Geekster.EmployeeAddressProject.Controller;

import com.Geekster.EmployeeAddressProject.Model.Address;
import com.Geekster.EmployeeAddressProject.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("addresses")
    public String addAddresses(@RequestBody List<Address> addressList){
        return addressService.addAddresses(addressList);
    }

    @GetMapping("addresses")
    public List<Address> getAllAddress(){
        return addressService.getAlllAddress();
    }

    @GetMapping("address/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PutMapping("address/{id}/{city}")
    public String updateAddressById(@PathVariable Long id,@PathVariable String city){
        return addressService.updateAddressById(id,city);
    }

    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }

}
