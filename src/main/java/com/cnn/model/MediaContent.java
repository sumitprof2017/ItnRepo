/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnn.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaContent {

@SerializedName("width")
@Expose
private Integer width;
@SerializedName("medium")
@Expose
private String medium;
@SerializedName("url")
@Expose
private String url;
@SerializedName("height")
@Expose
private Integer height;

public Integer getWidth() {
return width;
}

public void setWidth(Integer width) {
this.width = width;
}

public String getMedium() {
return medium;
}

public void setMedium(String medium) {
this.medium = medium;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public Integer getHeight() {
return height;
}

public void setHeight(Integer height) {
this.height = height;
}

}