/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import java.util.List;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author IvanGarMo
 */
@SpringBootTest
@Slf4j
public class JpqlRepositoryTests {
    
    @Autowired
    private StudentRepository studentRepository;
    
//    @Test
//    public void saveStudents() {
//        this.studentRepository.save(new Student("Leon", "Kennedy", 93));
//        this.studentRepository.save(new Student("Chris", "Redfield", 72));
//        this.studentRepository.save(new Student("Claire", "Redfielt", 96));
//        this.studentRepository.save(new Student("Jill", "Valentine", 84));
//        this.studentRepository.save(new Student("Rebecca", "Chambers", 99));
//    }
    
    @Test
    public void testFindAllFirstNameLastName() {
        List<Object[]> objects = studentRepository.findFirstNameLastName();
        for(Object[] obj : objects) {
            log.info("Obj: "+obj[0]+" - "+obj[1]);
        }
    }
    
    @Test
    public void testFindByLastName() {
        List<Student> students = studentRepository.findByLastName("Kennedy");
        printStudents("testFindByLastName: ", students);
    }
    
    @Test
    public void testFindByScoreRange() {
        List<Student> students = studentRepository.findScoreBetween(70, 90);
        printStudents("testFindByScoreRange", students);
    }
    
    @Test
//    @Transactional
//    @Modifying
//    @Query
    public void testDeleteByName() {
        String name = "Leon";
       studentRepository.deleteByFirstName(name); 
    }
    
    private void printStudents(String methodName, List<Student> students) {
        log.info(methodName);
        students.forEach(s -> log.info(s.toString()));
        log.info("-----------------------------------------------------------");
    }
}
