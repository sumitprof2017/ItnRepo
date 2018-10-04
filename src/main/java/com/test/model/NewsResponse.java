/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
@Entity
@Data
@DynamicInsert
@Table(name = "newsreponses")
public class NewsResponse implements Serializable {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
    String page;
//    @OneToOne(targetEntity=Source.class, mappedBy="name", fetch=FetchType.EAGER)
//    List<Source> source;
//    @ElementCollection
//	@CollectionTable(name = "id", joinColumns = @JoinColumn(name = "source_id"))
//    List<Source> source;
    @OneToOne
    @JoinColumn(name = "source_id")        
    Source source;
    int total;
   
          @ElementCollection
	@CollectionTable(name = "id", joinColumns = @JoinColumn(name = "news_id"))
              List<News> newsList;

     @OneToOne
    @JoinColumn(name = "news_id")
    News data;
            
}
