package com.amigos.java.spring.course.amigoscourse.customer;

import com.amigos.java.spring.course.amigoscourse.exceptions.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(path = "api/v1/customers")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/{id}/exception")
    public Customer getCustomerException(@PathVariable Long id) {
        throw new ApiRequestException(
                "ApiRequestException for /" + id + "/exception"
        );
    }

    @PostMapping
    public void createNewCustomer(@Valid @RequestBody Customer customer) {
        System.out.println(customer);
    }

    @DeleteMapping("/{id}")
    public void createNewCustomer(@PathVariable Long id) {
        System.out.println(id);
    }
}
