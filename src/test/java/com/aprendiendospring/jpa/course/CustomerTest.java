/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.HashSet;
import java.util.Set;
import javax.transaction.Transactional;
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
public class CustomerTest {
    @Autowired
    CustomerRepository customerRepository;
    
//    @Test
//    public void saveCustomer() {
//        Customer c = new Customer();
//        c.setName("Bill Clinton");
//        
//        PhoneNumber n1 = new PhoneNumber();
//        n1.setNumber("(XXX) XXX-XXXX");
//        n1.setType("Mobile");
//        c.addPhone(n1);
//        
//        PhoneNumber n2 = new PhoneNumber();
//        n2.setNumber("(YYY) YYY-YYYY");
//        n2.setType("Office phone");
//        c.addPhone(n2);
//        
//        customerRepository.save(c);
//    }
    
    @Test
    @Transactional
    public void testUpdateCustomer() {
        log.info("testUpdateCustomer");
        Customer c = customerRepository.findById(3).get();
        printCustomer("testUpdateCustomer", c);
        c.setName("William Clinton");
        Set<PhoneNumber> phoneNumbers = c.getPhoneNumbers();
        phoneNumbers.forEach(p -> {p.setType("Home");});
        customerRepository.save(c);
        
        
        c = customerRepository.findById(3).get();
        printCustomer("testUpdateCustomer", c);
    }
    
    
    @Test
    public void testDeleteCustomer() {
        log.info("testDeleteCustomer");
        customerRepository.deleteById(2);
    }
    //@Test
    //@Transactional
//    public void testReadCustomer() {
//        Customer c = customerRepository.findById(3).get();
//        printCustomer("testReadCustomer", c);
//    }
    
    private void printCustomer(String methodName, Customer c) {
        log.info(methodName);
        log.info("Customer Name: "+c.getName());
        log.info("Phones: ");
        log.info("--------------------------");
        c.getPhoneNumbers().forEach(p -> {
            log.info("Number: "+p.getNumber()+" Type: "+p.getType());
        });
        log.info("-----------------------------");
    }
}
