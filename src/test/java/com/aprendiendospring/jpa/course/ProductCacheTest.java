/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import javax.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author IvanGarMo
 */
@SpringBootTest
@Slf4j
public class ProductCacheTest {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private EntityManager entityManager;
    
    @Test
    public void testProduct() {
        Session session = entityManager.unwrap(Session.class);
        Product p1 = productRepository.findById(2).get();
        productRepository.findById(2).get();
        
        session.evict(p1);
        productRepository.findById(2).get();
    }
}
