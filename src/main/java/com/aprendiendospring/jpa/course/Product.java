/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author IvanGarMo
 */
@Data
@RequiredArgsConstructor
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private double price;
}
