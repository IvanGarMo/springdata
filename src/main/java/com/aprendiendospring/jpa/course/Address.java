/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author IvanGarMo
 */
@Embeddable
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Address {
    @Column(name="streetaddress")
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private String country;
}
