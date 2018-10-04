/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndtvnews.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

@SerializedName("link")
@Expose
private String link;
@SerializedName("fullimage")
@Expose
private String fullimage;
@SerializedName("guid")
@Expose
private Guid guid;
@SerializedName("description")
@Expose
private String description;
@SerializedName("StoryImage")
@Expose
private String storyImage;
@SerializedName("source")
@Expose
private String source;
@SerializedName("title")
@Expose
private String title;
@SerializedName("category")
@Expose
private String category;
@SerializedName("pubDate")
@Expose
private String pubDate;
@SerializedName("updatedAt")
@Expose
private String updatedAt;
@SerializedName("video_id")
@Expose
private String videoId;

public String getLink() {
return link;
}

public void setLink(String link) {
this.link = link;
}

public String getFullimage() {
return fullimage;
}

public void setFullimage(String fullimage) {
this.fullimage = fullimage;
}

public Guid getGuid() {
return guid;
}

public void setGuid(Guid guid) {
this.guid = guid;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getStoryImage() {
return storyImage;
}

public void setStoryImage(String storyImage) {
this.storyImage = storyImage;
}

public String getSource() {
return source;
}

public void setSource(String source) {
this.source = source;
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

public String getUpdatedAt() {
return updatedAt;
}

public void setUpdatedAt(String updatedAt) {
this.updatedAt = updatedAt;
}

public String getVideoId() {
return videoId;
}

public void setVideoId(String videoId) {
this.videoId = videoId;
}

}