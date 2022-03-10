/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Data;
/**
 *
 * @author IvanGarMo
 */
@Data
@Entity
@Table(name="card")
@PrimaryKeyJoinColumn(name="id")
public class CreditCard extends Payment {
    @Column(name="cardnumber")
    private String creditCardNumber;
}
