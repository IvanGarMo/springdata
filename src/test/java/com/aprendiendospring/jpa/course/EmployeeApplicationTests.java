/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author IvanGarMo
 */
@SpringBootTest
public class EmployeeApplicationTests {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Test
    public void saveEmployee() {
        Employee e = new Employee();
        e.setName("Antonio");
        employeeRepository.save(e);
    }
}
