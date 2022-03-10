/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
public class Programmer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private int salary;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="programmers_projects", joinColumns=@JoinColumn(name="programmer_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="project_id", referencedColumnName="id"))
    private Set<Project> projects;
    
    @Override
    public String toString() {
        return "[Id: "+this.id+"Name: "+this.name+" Salary: "+this.salary+" ]";
    }
}
