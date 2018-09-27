/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.itn;

import com.test.model.Itntest;
import com.test.repository.ItnRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class ItnController {
    @Autowired
    ItnRepository itnrepo;
    @RequestMapping(value = "/check")
    public Itntest findall(){
     Itntest itn = new Itntest();
     itn.setId(10);
     itn.setFirstName("sumit");
     itn.setLastName("shrestha");
     itn.setEmail("king@ki.com");
        System.out.println("pring get"+itn.getFirstName());
        System.out.println("hellow raju");
       return itnrepo.save(itn);
        
    }
    
     @RequestMapping(value = "/findall")
    public List<Itntest> letsfindall(){
   return itnrepo.findAll();
        
    }
}
