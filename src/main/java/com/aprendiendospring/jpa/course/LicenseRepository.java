/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 *
 * @author IvanGarMo
 */
public interface LicenseRepository extends CrudRepository<License, Integer> {
    
}
