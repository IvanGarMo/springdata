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
public class PaymentTest {
    @Autowired
    PaymentRepository paymentRepository;
    
    @Test
    public void testCheckCapture() {
        Check check = new Check();
        check.setId(1);
        check.setAmount(1999.99d);
        check.setCheckNumber("8923-1234-4567");
        paymentRepository.save(check);
    }
    
    @Test
    public void testCreditCardCapture() {
        CreditCard cc = new CreditCard();
        cc.setId(2);
        cc.setAmount(2500.50d);
        cc.setCreditCardNumber("1234-1234-1234-1234");
        paymentRepository.save(cc);
    }
}
