/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

import java.io.Serializable;
import java.util.Calendar;
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
@Table(name = "itntest")
@DynamicInsert(true)
public class Itntest implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
        
        
        @Column(name = "email")
	private String email;
        @Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	
	
	
//	@Column(name = "added_on")
//	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
//	private Calendar addedOn;

   
}

