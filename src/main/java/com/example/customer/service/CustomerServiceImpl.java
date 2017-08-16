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
        CustomerRepository.save(customer);
    }

    @Transactional

    public void add(List<Customer> customers) {
        for (Customer customer : customers) {
            CustomerRepository.save(customer);
        }
    }

    @Override
    public Customer getById(int id) {
        return CustomerRepository.findOne(id);
    }

    @Override
    public List<Customer> get() {
        return CustomerRepository.findAll();
    }

    @Transactional
    @Override
    public void update(Customer customer) {
        CustomerRepository.save(customer);
    }

    @Transactional

    public void delete(int id) {
        CustomerRepository.delete(id);
    }



}
