/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnn.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeedburnerInfo {

@SerializedName("xmlns:feedburner")
@Expose
private String xmlnsFeedburner;
@SerializedName("uri")
@Expose
private String uri;

public String getXmlnsFeedburner() {
return xmlnsFeedburner;
}

public void setXmlnsFeedburner(String xmlnsFeedburner) {
this.xmlnsFeedburner = xmlnsFeedburner;
}

public String getUri() {
return uri;
}

public void setUri(String uri) {
this.uri = uri;
}

}