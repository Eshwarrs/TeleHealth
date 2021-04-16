/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.telehealth.helper;

import java.lang.module.Configuration;
import org.hibernate.SessionFactory;

/**
 *
 * @author 16055
 */
public class FactoryProvider {
    
    private static SessionFactory factory;
    
    public static SessionFactory getfactory(){
    
        
        try{
        if(factory==null){
        
            factory= new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
           // factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
            
            
        }
        catch(Exception ex){
        ex.printStackTrace();
        }
        return factory;
    }
}
