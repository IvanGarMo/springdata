/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aprendiendospring.jpa.course;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author IvanGarMo
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    
    List<Customer> findAll(Pageable page);
    
    @Query("update Customer set email = :email where id = :id")
    @Modifying
    @Transactional
    public void updateEmail(@Param("id") int id, @Param("email") String email);
}
