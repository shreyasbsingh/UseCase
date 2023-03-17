package com.example.UseCase.Controller;

import com.example.UseCase.Customer.Customer;
import com.example.UseCase.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/customer")
public class customerController {
    private final CustomerService customerService;
    @Autowired
    public customerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping(path = "/{customerID}")
    public Optional<Customer> getCustomerbyID(@PathVariable("customerID") Long customerID){
        return customerService.getCustomerbyID(customerID);
    }
}
