package com.example.customer.service;

import com.example.customer.domain.Customer;
import com.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by phillipdelia on 8/3/17.
 */

@Service
public class CustomerServiceImpl  implements CustomerService{

    @Autowired
    CustomerRepository CustomerRepository;

    @Transactional
    @Override
    public void add(Customer customer) {
        CustomerRepository.add(customer);
    }

    @Transactional

    public void add(List<Customer> customers) {
        for (Customer customer : customers) {
            CustomerRepository.add(customer);
        }
    }

    @Override
    public Customer getById(int id) {
        return CustomerRepository.getById(id);
    }

    @Override
    public List<Customer> get() {
        return CustomerRepository.get();
    }

    @Transactional
    @Override
    public void update(Customer customer) {
        CustomerRepository.update(customer);
    }

    @Transactional

    public void delete(int id) {
        CustomerRepository.delete(id);
    }



}
