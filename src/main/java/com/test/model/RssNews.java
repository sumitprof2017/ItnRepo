/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

@Data
@DynamicInsert
public class RssNews {

private String link;

private String dcCreator;

private String description;

private String guid;

private String title;

private String category;

private String pubDate;
}
