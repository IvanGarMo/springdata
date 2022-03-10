/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.HashSet;
import java.util.Set;
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
public class ProgrammerTest {
    @Autowired
    private ProgrammerRepository programmerRepository;
    
    @Test
    public void testCapture() {
        Programmer p = new Programmer();
        p.setName("Toomas");
        p.setSalary(10000);
        
        Set<Project> projects = new HashSet<>();
        Project p1 = new Project();
        p1.setName("Petbook");
        Project p2 = new Project();
        p2.setName("Petstagram");
        projects.add(p1);
        projects.add(p2);
        p.setProjects(projects);
        
        programmerRepository.save(p);
    }
    
    @Test
    public void testRead() {
        Programmer p = programmerRepository.findById(1).get();
        this.printProgrammerProject("testRead", p);
    }
    
    private void printProgrammerProject(String methodName, Programmer programmer) {
        log.info("MethodName: "+methodName);
        log.info("Programmer: "+programmer.toString());
        log.info("Projects: ");
        log.info("--------------------------------");
        programmer.getProjects().forEach(p -> log.info(p.toString()));
    }
}
