/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

import java.io.Serializable;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

@Data
@DynamicInsert
public class News implements Serializable {
    String title;
    String link;
    String category;
    String published_date;
    String guid;
    String image;
    String description;
    String source;
}
