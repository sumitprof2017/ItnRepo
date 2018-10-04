/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndtvnews.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Guid {

@SerializedName("identifier")
@Expose
private String identifier;
@SerializedName("cache")
@Expose
private Integer cache;
@SerializedName("isPermaLink")
@Expose
private Boolean isPermaLink;
@SerializedName("ignore")
@Expose
private String ignore;
@SerializedName("content")
@Expose
private Integer content;

public String getIdentifier() {
return identifier;
}

public void setIdentifier(String identifier) {
this.identifier = identifier;
}

public Integer getCache() {
return cache;
}

public void setCache(Integer cache) {
this.cache = cache;
}

public Boolean getIsPermaLink() {
return isPermaLink;
}

public void setIsPermaLink(Boolean isPermaLink) {
this.isPermaLink = isPermaLink;
}

public String getIgnore() {
return ignore;
}

public void setIgnore(String ignore) {
this.ignore = ignore;
}

public Integer getContent() {
return content;
}

public void setContent(Integer content) {
this.content = content;
}

}