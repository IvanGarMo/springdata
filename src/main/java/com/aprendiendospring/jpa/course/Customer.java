/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;

/**
 *
 * @author IvanGarMo
 */
@Data
@RequiredArgsConstructor
@Entity
@AllArgsConstructor
public class Customer {
    @Id
    private int id;
    private String username;
    private String email;
    
    public Customer(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
