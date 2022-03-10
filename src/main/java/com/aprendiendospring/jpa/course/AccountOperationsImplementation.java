/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendiendospring.jpa.course;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author IvanGarMo
 */
@Service
public class AccountOperationsImplementation implements AccountOperations {
    @Autowired
    private BankAccountRepository repo;
    
    @Override
    @Transactional
    public void transfers(int amount) {
        BankAccount obamaAccount = repo.findById(1).get();
        BankAccount trumpAccount = repo.findById(2).get();
        
        int obamaAccountNewBalance = obamaAccount.getBalance() - amount;
        obamaAccount.setBalance(obamaAccountNewBalance);
        repo.save(obamaAccount);
        
        if(true) {
            throw new RuntimeException("Prueba");
        }
        
        int trumpAccountNewBalance = trumpAccount.getBalance() + amount;
        trumpAccount.setBalance(trumpAccountNewBalance);
        repo.save(trumpAccount);
    }
    
}
