/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author IvanGarMo
 */
@Entity
@Getter
@Setter
public class License {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String type;
    @Temporal(value=TemporalType.DATE)
    private Date validFrom;
    @Temporal(value=TemporalType.DATE)
    private Date validTo;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="person_id")
    private Person person;
    
    @Override
    public String toString() {
        return "[Id: "+ this.id +" Type: "+this.type+" validFrom: "+this.validFrom+" validTo: "+this.validTo+"]";
    }
}
