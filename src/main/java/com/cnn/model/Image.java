/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnn.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

@SerializedName("link")
@Expose
private String link;
@SerializedName("title")
@Expose
private String title;
@SerializedName("url")
@Expose
private String url;

public String getLink() {
return link;
}

public void setLink(String link) {
this.link = link;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

}