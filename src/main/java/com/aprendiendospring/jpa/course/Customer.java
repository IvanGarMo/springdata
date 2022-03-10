/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author IvanGarMo
 */
@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy="customer", cascade=CascadeType.ALL, fetch=FetchType.LAZY) //Nombre de la entidad padre en minúsculas
    @ElementCollection
    private Set<PhoneNumber> phoneNumbers;
    
    public void addPhone(PhoneNumber phone) {
        if(this.phoneNumbers == null) {
            this.phoneNumbers = new HashSet<>();
        }
        if(phone != null) {
            phone.setCustomer(this);
            this.phoneNumbers.add(phone);
        }
    }
}
