/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author IvanGarMo
 */
@Entity
@NoArgsConstructor
@Table(name="phone_number")
@Getter
@Setter
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String number;
    private String type;
    @ManyToOne
    @JoinColumn(name="customer_id") //El nombre de la columna llave foránea en la tabla, no en la entidad
    private Customer customer;
}
