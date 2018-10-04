/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Guid {

@SerializedName("isPermaLink")
@Expose
private Boolean isPermaLink;
@SerializedName("content")
@Expose
private String content;

public Boolean getIsPermaLink() {
return isPermaLink;
}

public void setIsPermaLink(Boolean isPermaLink) {
this.isPermaLink = isPermaLink;
}

public String getContent() {
return content;
}

public void setContent(String content) {
this.content = content;
}

}