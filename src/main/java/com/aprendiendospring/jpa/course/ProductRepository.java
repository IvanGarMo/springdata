/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author IvanGarMo
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
    @Query(value="CALL GetAllProducts", nativeQuery=true)
    List<Product> findAllSP();
    
    @Query(value="CALL GetAllProductsByPrice (:price_in)", nativeQuery=true)
    List<Product> findAllByPriceSP(double price_in);
    
    @Query(value="CALL GetAllProductsCountByPrice (:price_in)", nativeQuery=true)
    int countProductsByPriceSP(double price_in);
}
