/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author IvanGarMo
 */
@SpringBootTest
@Slf4j
public class CustomerApplicationTests {
    @Autowired
    private CustomerRepository customerRepo;
    
    @Test
    public void addCustomer() {
        ArrayList<Customer> customers = new ArrayList<>();
        
        Customer c = new Customer();
        c.setId(1);
        c.setUsername("garmo");
        c.setEmail("ivangarmo98@gmail.com");
        customers.add(c);
        
        c = new Customer();
        c.setId((2));
        c.setUsername("sempi");
        c.setEmail("saulxperience@gmail.com");
        customers.add(c);
        customerRepo.saveAll(customers);
    }
    
    @Test
    public void cuentaCustomer() {
        long EXPECTED = 2;
        long cuenta = customerRepo.count();
        assertEquals(EXPECTED, cuenta);
    }
    
    
    @Test
    public void testCustomer() {
        Optional<Customer> optCustomer = customerRepo.findById(1);
        assertNotNull(optCustomer.get());
    }
    
    @Test
    public void updateCustomer() {
        Customer c = customerRepo.findById(1).get();
        c.setUsername("garmo2");
        customerRepo.save(c);
    }
}
