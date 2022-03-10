/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Data;
/**
 *
 * @author IvanGarMo
 */
@Data
@Entity
@DiscriminatorValue("cc")
public class CreditCard extends Payment {
    @Column(name="cardnumber")
    private String creditCardNumber;
}
