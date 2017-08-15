package com.example.customer.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by phillipdelia on 8/4/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {


    //testAddGet();

    //  testUpdate();

    //testDelete();


        @Autowired
        CustomerService customerService;

//        @Test
//        public void testTransactional() {
//            Customer customer1 = createTestCustomer();
//          Customer customer2 = createTestCustomer();
//            List<Customer> customer = new ArrayList<>();
//          customer.add(customer1);
//            customer.add(customer2);
//
//             Cause an error
//              customer2.setFirstName(null);
//            try {
//                CustomerService.add(customer);
//            } catch(Exception e) {
//                 expected this
//            }
//
//            customer = CustomerService.get();
//            Customer customer3 = findInList(customer, customer1.getFirstName(), customer1.getLastName());
//            Assert.assertNull("The first customer you  created should have been returned", customer3);
  //      }
    }

