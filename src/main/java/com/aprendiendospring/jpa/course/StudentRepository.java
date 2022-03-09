/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.test.annotation.Rollback;

/**
 *
 * @author IvanGarMo
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {
    @Query("from Student")
    public List<Student> findAll();
    
    @Query("select firstName, lastName from Student") //Las cnsultas parciales regresan Object[]
    public List<Object[]> findFirstNameLastName();
    
    @Query("from Student where lastName=:lastName")
    public List<Student> findByLastName(@Param("lastName") String lastName);
    
    @Query("from Student where score> :lowerLimit AND score< :upperLimit")
    public List<Student> findScoreBetween(@Param("lowerLimit") int lowerLimit, @Param("upperLimit") int upperLimit);
    
    @Query("delete from Student where firstName= :firstName")
    @Transactional
    @Modifying
    //@Rollback(false)
    public void deleteByFirstName(@Param("firstName") String firstName);
}
