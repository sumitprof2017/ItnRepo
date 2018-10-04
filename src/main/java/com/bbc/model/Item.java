/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

@SerializedName("media:thumbnail")
@Expose
private MediaThumbnail mediaThumbnail;
@SerializedName("link")
@Expose
private String link;
@SerializedName("description")
@Expose
private String description;
@SerializedName("guid")
@Expose
private Guid guid;
@SerializedName("title")
@Expose
private String title;
@SerializedName("pubDate")
@Expose
private String pubDate;

public MediaThumbnail getMediaThumbnail() {
return mediaThumbnail;
}

public void setMediaThumbnail(MediaThumbnail mediaThumbnail) {
this.mediaThumbnail = mediaThumbnail;
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

public Guid getGuid() {
return guid;
}

public void setGuid(Guid guid) {
this.guid = guid;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getPubDate() {
return pubDate;
}

public void setPubDate(String pubDate) {
this.pubDate = pubDate;
}

}