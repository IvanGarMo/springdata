/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.io.Serializable;
import java.util.Random;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

/**
 *
 * @author IvanGarMo
 */
public class CustomGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor ssci, Object empleado) throws HibernateException {
        int id = 0;
        Random r = new Random();
        id = r.nextInt(65135);
        return id;
    }
    
}
