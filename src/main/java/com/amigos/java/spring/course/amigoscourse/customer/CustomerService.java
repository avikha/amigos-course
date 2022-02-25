package com.amigos.java.spring.course.amigoscourse.customer;

import com.amigos.java.spring.course.amigoscourse.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer getCustomerById(Long id) {
        return customerRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Could not find customer with id: " + id));
    }
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
