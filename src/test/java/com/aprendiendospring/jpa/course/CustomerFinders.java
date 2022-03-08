/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author IvanGarMo
 */
public interface CustomerFinders extends CrudRepository<Customer, Integer> {
    List<Customer> findCustomerByEmailAndUsername(String email, String username);
    List<Customer> findCustomerByEmailLike(String email);
    List<Customer> findCustomerByIdIn(List<Integer> ids);
}
