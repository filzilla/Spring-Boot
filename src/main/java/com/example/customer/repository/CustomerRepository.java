package com.example.customer.repository;

import com.example.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by phillipdelia on 8/3/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {



}



