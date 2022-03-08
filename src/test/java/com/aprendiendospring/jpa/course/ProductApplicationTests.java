/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.Arrays;
import java.util.List;
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
public class ProductApplicationTests {
    @Autowired
    private ProductRepository productRepository;
    
//    @Test
//    public void testFindByName() {
//        String name = "Xbox One";
//        List<Product> products = productRepository.findProductByName(name);
//        printProduct(products);
//    }
//    
//    @Test
//    public void testFindByNameAndDescription() {
//        String name = "Resident Evil";
//        String description = "Una amenaza bioterrorista queda suelta";
//        List<Product> products = productRepository.findProductByNameAndDescription(name, description);
//        printProduct(products);
//    }
//    
//    @Test
//    public void testFindByPriceGreaterThan() {
//        Double price = 600d;
//        List<Product> products = productRepository.findProductByPriceGreaterThan(price);
//        printProduct(products);
//    }
//    
//    @Test
//    public void testFindProductByDescriptionContains() {
//        String contains = "Kait";
//        List<Product> products = productRepository.findProductByDescriptionContains(contains);
//        printProduct(products);
//    }
    
    @Test
    public void testFindProductByPriceBetween() {
        Double price1 = 200d;
        Double price2 = 500d;
        List<Product> products = productRepository.findProductByPriceBetween(price1, price2);
        printProduct(products);
    }
    
    @Test
    public void testFindProductByDescriptionLike() {
        String descriptionLike = "amenaza";
        List<Product> products = productRepository.findProductByDescriptionLike(descriptionLike);
        printProduct(products);
    }
    
//    @Test
//    public void testFindProductByIdIn() {
//        List<Integer> ids = Arrays.asList(1, 3, 5);
//        List<Product> products = productRepository.findProductByIdIn(ids);
//        printProduct(products);
//    }
    
    public void printProduct(List<Product> products) {
      products.forEach(p -> {
          log.info("Id: "+p.getId()+" Name: "+p.getName()+" Desc: "+p.getDescription()+" Price: "+p.getPrice());
      });
    }
}
