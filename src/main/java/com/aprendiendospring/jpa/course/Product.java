/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
/**
 *
 * @author IvanGarMo
 */
@Entity
@Getter
@Setter
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String name;
    private String description;
    private double price;
}
