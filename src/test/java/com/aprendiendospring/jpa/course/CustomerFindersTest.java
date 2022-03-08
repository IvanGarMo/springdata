/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author IvanGarMo
 */
@SpringBootTest
@Slf4j
public class CustomerFindersTest {
    
    @Autowired
    CustomerFinders customerRepository;
    
    @Test
    public void testFindCustomersByNameAndEmail() {
        String name = "garmo2";
        String email = "ivangarmo98@gmail.com";
        List<Customer> customers = customerRepository.findCustomerByEmailAndUsername(email, name);
        printCustomer(customers);
    }
    
    @Test
    public void testFindByEmailLike() {
        String emailFragment = "gmail";
        List<Customer> customers = customerRepository.findCustomerByEmailLike(emailFragment);
        printCustomer(customers);
    }
    
    @Test
    public void testFindByIdIn() {
        List<Integer> ids = Arrays.asList(1, 5);
        List<Customer> customers = customerRepository.findCustomerByIdIn(ids);
        printCustomer(customers);
    }
    
    private void printCustomer(List<Customer> customers) {
        customers.forEach(c -> {
            log.info("Customer data: Email "+c.getEmail()+" Username: "+c.getUsername()+" Id: "+c.getId());
        });
    }
}
