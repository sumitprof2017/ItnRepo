/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.itn;

import com.test.model.Itntest;
import com.test.repository.ItnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping(value = "/hi")
public class TestController {
    
    @Autowired
    ItnRepository itnrepo;
    @RequestMapping(value = "/find")
    public Itntest hellow(){
      return (Itntest) itnrepo.findAll();
       
    }
    
     @RequestMapping(value = "/save")
    public Itntest find(){
   Itntest itntest = new Itntest();
   itntest.setFirstName("sumit");
   itntest.setLastName("shrestha");
   itntest.setEmail("d@gmail.com");
         System.out.println("Your name is:"+itntest.getFirstName());
   
   
  return  itnrepo.save(itntest);
   
       
    }
    

}
