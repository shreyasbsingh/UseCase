package com.example.UseCase.service;

import com.example.UseCase.Customer.Customer;
import com.example.UseCase.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CustomerService {
    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> getCustomerbyID(Long customerID){
        Customer customer=customerRepository.findById(customerID).orElseThrow(()-> new IllegalStateException("Customer with this ID is not present"));
        return customerRepository.findById(customerID);
    }
}
