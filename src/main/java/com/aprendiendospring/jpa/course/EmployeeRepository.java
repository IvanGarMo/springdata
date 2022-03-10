/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author IvanGarMo
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    
}
