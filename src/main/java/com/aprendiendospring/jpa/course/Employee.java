/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author IvanGarMo
 */
@Data
@RequiredArgsConstructor
@Entity
public class Employee {
    
    //Para generación por tabla
    @TableGenerator(name="employee_gen", table="gen_id_employee", valueColumnName="gen_id", pkColumnValue="gen_name", allocationSize=10)
    //@GenericGenerator(name="emp_gen", strategy="com.aprendiendospring.jpa.course.CustomGenerator")
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="employee_gen")    
    //@GeneratedValue(strategy=GenerationType.IDENTITY) //Para generación por IDENTITY
    //@GeneratedValue(generator="emp_gen")
    private int id;
    private String name;
}
