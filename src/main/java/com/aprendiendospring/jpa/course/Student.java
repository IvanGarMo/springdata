/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author IvanGarMo
 */
@Entity
@Data
@RequiredArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="fname")
    private String firstName;
    @Column(name="lname")
    private String lastName;
    private int score;
    
    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
    
    public String toString() {
        return "Student: ["+"id: "+this.id+" name: "+this.firstName+" lname "+this.lastName+" score: "+this.score+"]";
    }
}
