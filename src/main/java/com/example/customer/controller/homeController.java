package com.example.customer.controller;

import com.example.customer.domain.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by phillipdelia on 8/7/17.
 */

@Controller

public class homeController {

@Autowired
    CustomerService customerService;




   //@RequestMapping(path = "/customers", method = RequestMethod.GET)
    @RequestMapping("/customers")
    public  String customers(Model model) {

        System.out.println("success with my customer page");


        model.addAttribute("customers", customerService.get());

// drill down
        return "customers";

    }

    @RequestMapping(path= "/addCustomers", method = RequestMethod.GET)
    public String addCustomers(Model model){

        return "addCustomers";
    }



    @RequestMapping(path ="/addCustomers", method = RequestMethod.POST)
    public String addCustomers(@RequestParam(value ="firstName") String firstName,
                               @RequestParam(value ="lastName") String lastName,
                               @RequestParam(value ="email") String email,
                               @RequestParam(value ="phone") String phone, Model model) {

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPhone((phone));

         List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);

        customerService.add(customer);


        System.out.println(customer.getFirstName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getId());
        model.addAttribute("customer", customerService);
        System.out.println(model);
        System.out.println(customerList.get(0));


        return "redirect:/customers";
    }




   // @RequestMapping(path = "/viewCustomer", method = RequestMethod.GET)
    @RequestMapping("/viewCustomer/{customerId}")
    public String viewCustomer(@PathVariable int customerId, Model model) {

       Customer chosenCustomer = customerService.getById(customerId);

         model.addAttribute("customer", chosenCustomer);

        return "viewCustomer";
    }
}


