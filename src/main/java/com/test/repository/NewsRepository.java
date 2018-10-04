/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.repository;

import com.test.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author NITV-Sumit
 */
public interface NewsRepository extends JpaRepository<News, Integer> {
    
}
