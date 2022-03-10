/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author IvanGarMo
 */
@SpringBootTest
@Slf4j
public class LicenseTest {
    @Autowired
    private LicenseRepository licenseRepository;
    
//    @Test
//    public void testAddLicense() {
//        License license = new License();
//        license.setType("CAR");
//        license.setValidFrom(new Date());
//        license.setValidTo(new Date());
//        
//        Person person = new Person();
//        person.setFirstName("Mario");
//        person.setLastName("Draghi");
//        person.setAge(63);
//        
//        license.setPerson(person);
//        person.setLicense(license);
//        licenseRepository.save(license);
//    }
    
    @Test
    public void testReadLicense() {
        License license = licenseRepository.findById(1).get();
        printLicense("testReadLicense", license);
    }
    
    private void printLicense(String methodName, License license) {
        log.info(methodName);
        log.info("License: "+license.toString());
        log.info("Person: "+license.getPerson());
    }
}
