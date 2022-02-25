package com.amigos.java.spring.course.amigoscourse.customer;

import com.amigos.java.spring.course.amigoscourse.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository
        extends JpaRepository<Customer, Long> {
}
