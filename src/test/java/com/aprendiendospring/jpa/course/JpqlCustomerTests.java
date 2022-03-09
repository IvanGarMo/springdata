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
public class JpqlCustomerTests {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    @Test
    public void updateEmail() {
        int id = 1;
        String correo = "ivangarmo982@gmail.com";
        customerRepository.updateEmail(id, correo);
        
        id = 5;
        correo = "lhamdamdegarcia@gmail.com";
        customerRepository.updateEmail(id, correo);
    }
}
