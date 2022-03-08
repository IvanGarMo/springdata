/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author IvanGarMo
 */
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer>{
    List<Product> findProductByName(String name);
    List<Product> findProductByNameAndDescription(String name, String descrition);
    List<Product> findProductByPriceGreaterThan(Double price);
    List<Product> findProductByDescriptionContains(String desc);
    List<Product> findProductByPriceBetween(Double price1, Double price2);
    List<Product> findProductByDescriptionLike(String desc);
    List<Product> findProductByIdIn(List<Integer> ids, PageRequest page);
}
