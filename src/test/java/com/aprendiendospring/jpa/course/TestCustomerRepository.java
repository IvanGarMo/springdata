/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

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
public class TestCustomerRepository {
    @Autowired
    CustomerRepository customerRepository;
    
    @Test
    public void testAddCustomer() {
        Customer c = new Customer();
        c.setId(100);
        c.setUsername("obamabarack");
        c.setEmail("obama@gov.us");
        Address address = new Address();
        address.setStreetAddress("1600 Pennsylvania Avenue");
        address.setCity("Washington");
        address.setState("DC");
        address.setZipcode("25000");
        address.setCountry("USA");
        c.setAddress(address);
        customerRepository.save(c);
    }
}
