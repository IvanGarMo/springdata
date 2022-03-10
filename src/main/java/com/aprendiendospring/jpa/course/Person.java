/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author IvanGarMo
 */
@Entity
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    @OneToOne(mappedBy="person")
    private License license;
    
    @Override
    public String toString() {
        return "[Id: "+this.id+" firstName: "+this.firstName+" lastName: " +this.lastName+" Age: "+this.age+"]";
    }
}
