/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author IvanGarMo
 */
@Entity
@Getter
@Setter
class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(mappedBy="projects")
    private Set<Programmer> programmers;
    
    @Override
    public String toString() {
        return "[Id: "+this.id+ " Name: "+name+"]";
    }
}
