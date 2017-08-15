package com.example.customer.service;

import com.example.customer.domain.Customer;

import java.util.List;

/**
 * Created by phillipdelia on 8/3/17.
 */


public interface CustomerService {

    // add a customer
    void add (Customer customer);
    //update a customer
    void update (Customer customer);
    //get a customer by id
    Customer getById(int id);
    // get all customers
    List<Customer> get();
    //delete a customer
    //   void delete(int id);



}
