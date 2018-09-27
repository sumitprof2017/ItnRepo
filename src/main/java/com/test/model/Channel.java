/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

//import java.util.List;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Channel {

@SerializedName("image")
@Expose
private Image image;
@SerializedName("item")
@Expose
private List<Item> item;
@SerializedName("link")
@Expose
private String link;
@SerializedName("description")
@Expose
private String description;
@SerializedName("language")
@Expose
private String language;
@SerializedName("title")
@Expose
private String title;
@SerializedName("atom:link")
@Expose
private AtomLink atomLink;

public Image getImage() {
return image;
}

public void setImage(Image image) {
this.image = image;
}

public List<Item> getItem() {
return item;
}

public void setItem(List<Item> item) {
this.item = item;
}

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

public String getLanguage() {
return language;
}

public void setLanguage(String language) {
this.language = language;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public AtomLink getAtomLink() {
return atomLink;
}

public void setAtomLink(AtomLink atomLink) {
this.atomLink = atomLink;
}

}