/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.repository;

import com.test.model.Itntest;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItnRepository extends JpaRepository<Itntest, Integer>{

    
}
