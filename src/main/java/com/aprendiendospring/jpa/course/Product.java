/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author IvanGarMo
 */
@Entity
@Getter
@Setter
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private double price;
    
    @Override
    public String toString() {
        return "[Id: "+this.id+" Name: "+this.name+" Description: "+this.description+" Price: "+this.price+"]";
    }
}
