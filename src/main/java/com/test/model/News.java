/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

import java.io.Serializable;
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
@Table(name = "news")
public class News implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "news_id")
    private Integer News_id;
    @Column(name = "title")
    String title;
    @Column(name = "link")
    String link;
    @Column(name = "category")
    String category;
    @Column(name = "published_date")
    String published_date;
    @Column(name = "guid")
    String guid;
    @Column(name = "image")
    String image;
    @Column(name = "description")
    String description;
    @Column(name = "source")
    String source;
}
