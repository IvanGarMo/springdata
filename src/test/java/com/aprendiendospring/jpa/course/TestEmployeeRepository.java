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
public class TestEmployeeRepository {
    @Autowired
    EmployeeRepository employeeRepository;
    
    @Test
    public void testCaptureEmployee() {
        Employee e = new Employee();
        e.setId(1000);
        e.setName("Joe Biden");
        Address address = new Address();
        address.setStreetAddress("1600 Pennsylvania Avenue");
        address.setCity("Washington");
        address.setState("DC");
        address.setZipcode("25000");
        address.setCountry("USA");
        e.setAddress(address);
        this.employeeRepository.save(e);
    }
}
