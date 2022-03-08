/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

/**
 *
 * @author IvanGarMo
 */
@SpringBootTest
@Slf4j
public class PagingSortingTests {
    @Autowired
    private ProductRepository productRepository;
    
    @Test
    public void testPagingProducts() {
        Iterable<Product> products = productRepository.findAll(PageRequest.of(0, 2));
        printProduct(products);
    }
    
    @Test
    public void testSortingProducts() {
        Iterable<Product> products = productRepository.findAll(Sort.by(Direction.ASC, "price"));
        printProduct(products);
    }
    
    //Un objeto order depende de Direction y Campo de dirección
    @Test
    public void testSortingProductsOrder() {
        Order order1 = new Order(Sort.Direction.ASC, "price");
        Order order2 = new Order(Sort.Direction.DESC, "name");
        List<Order> orderMode = new ArrayList<>();
        orderMode.add(order1);
        orderMode.add(order2);
        Iterable<Product> products = productRepository.findAll(Sort.by(orderMode));
        printProduct(products);
    }
    
//    @Test
//    public void testFindProductByIdCustom() {
//        List<Integer> ids = Arrays.asList(1, 2, 3, 4, 5);
//        PageRequest page = PageRequest.of(0, 2);
//        List<Product> products = productRepository.findProductByIdIn(ids, page);
//        printProduct(products);
//    }
    
    private void printProduct(Iterable<Product> products) {
        products.forEach(p -> {
            log.info("Product: Name "+p.getName()+" Description: "+p.getDescription()+" Price: "+p.getPrice());
        });
    }
}
