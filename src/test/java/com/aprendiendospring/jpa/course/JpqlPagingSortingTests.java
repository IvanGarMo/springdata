/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

/**
 *
 * @author IvanGarMo
 */
@SpringBootTest
@Slf4j
public class JpqlPagingSortingTests {
    @Autowired
    CustomerRepository customerRepository;
    
    @Test
    public void addCustomer() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "joebiden", "biden@gov.us"));
        customers.add(new Customer(2, "obamabarack", "obama@gov.us"));
        customers.add(new Customer(3, "hclinton", "hclinton@gov.us"));
        customers.add(new Customer(4, "bclinton", "bclinton@gov.us"));
        customers.add(new Customer(5, "gore", "algore@gov.us"));
        customers.add(new Customer(6, "schumer", "chuck@gov.us"));
        customers.add(new Customer(7, "kerry", "jkerry@gov.us"));
        customers.add(new Customer(8, "sullivan", "joesulli@gov.us"));
        customers.add(new Customer(9, "polis", "jpolis@gov.us"));
        customers.add(new Customer(10, "psaki", "jpsaki@gov.us"));
        customerRepository.saveAll(customers);
    }
    
    @Test
    public void testPagingFive() {
        List<Customer> customers = customerRepository.findAll(PageRequest.of(0, 5));
        printCustomers("testPagingFive", customers);
    }
    
    @Test
    public void testPagingTen() {
        List<Customer> customers = customerRepository.findAll(PageRequest.of(0, 10));
        printCustomers("testPagingTen", customers);
    }
    
    private void printCustomers(String methodName, List<Customer> customer) {
        log.info(methodName);
        customer.forEach(c -> {
            log.info("Customer - Name: "+c.getUsername()+" Email: "+c.getEmail());
        });
    }
}
