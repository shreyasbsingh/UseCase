package com.example.UseCase.Customer;

import com.example.UseCase.Repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args ->{
            Customer customer_1=new Customer(
                    "Mr",
                    "Alex",
                    "Lu",
                    "XYZ",
                    320000,
                    "XYZ",
                    "XYZ",
                    "123456",
                    "XYZ",
                    "XYZ",
                    "USA",
                    "HOME",
                    "PERSONAL",
                    123456789,
                    "Personal",
                    "xyz@gmail.com"
            );
            Customer customer_2=new Customer(
                    "Mrs",
                    "Angela",
                    "Lu",
                    "XYZ",
                    220000,
                    "XYZ",
                    "XYZ",
                    "123456",
                    "XYZ",
                    "XYZ",
                    "USA",
                    "HOME",
                    "PERSONAL",
                    123456789,
                    "Personal",
                    "xyz@gmail.com"
            );
            customerRepository.saveAll(
                    List.of(customer_1,customer_2)
            );
        };
    }
}
