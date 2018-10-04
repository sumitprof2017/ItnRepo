/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

@Data
@Entity
@DynamicInsert
@Table(name = "source")

public class Source {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "source_id")
      private Integer id;
    @Column(name = "name")
    String name;
}
