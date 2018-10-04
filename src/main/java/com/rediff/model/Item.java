/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rediff.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

@SerializedName("link")
@Expose
private String link;
@SerializedName("description")
@Expose
private String description;
@SerializedName("title")
@Expose
private String title;

public String getLink() {
return link;
}

public void setLink(String link) {
this.link = link;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

}