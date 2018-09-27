/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

@SerializedName("link")
@Expose
private String link;
@SerializedName("dc:creator")
@Expose
private String dcCreator;
@SerializedName("description")
@Expose
private String description;
@SerializedName("guid")
@Expose
private String guid;
@SerializedName("title")
@Expose
private String title;
@SerializedName("category")
@Expose
private String category;
@SerializedName("pubDate")
@Expose
private String pubDate;

public String getLink() {
return link;
}

public void setLink(String link) {
this.link = link;
}

public String getDcCreator() {
return dcCreator;
}

public void setDcCreator(String dcCreator) {
this.dcCreator = dcCreator;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getGuid() {
return guid;
}

public void setGuid(String guid) {
this.guid = guid;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getCategory() {
return category;
}

public void setCategory(String category) {
this.category = category;
}

public String getPubDate() {
return pubDate;
}

public void setPubDate(String pubDate) {
this.pubDate = pubDate;
}

}