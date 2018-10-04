/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnn.model;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Channel {

@SerializedName("image")
@Expose
private Image image;
@SerializedName("copyright")
@Expose
private String copyright;
@SerializedName("item")
@Expose
private List<Item> item = null;
@SerializedName("lastBuildDate")
@Expose
private String lastBuildDate;
@SerializedName("link")
@Expose
private String link;
@SerializedName("description")
@Expose
private String description;
@SerializedName("generator")
@Expose
private String generator;
@SerializedName("language")
@Expose
private String language;
@SerializedName("title")
@Expose
private String title;
@SerializedName("pubDate")
@Expose
private String pubDate;
@SerializedName("ttl")
@Expose
private Integer ttl;
@SerializedName("feedburner:info")
@Expose
private FeedburnerInfo feedburnerInfo;
@SerializedName("atom10:link")
@Expose
private List<Atom10Link> atom10Link = null;

public Image getImage() {
return image;
}

public void setImage(Image image) {
this.image = image;
}

public String getCopyright() {
return copyright;
}

public void setCopyright(String copyright) {
this.copyright = copyright;
}

public List<Item> getItem() {
return item;
}

public void setItem(List<Item> item) {
this.item = item;
}

public String getLastBuildDate() {
return lastBuildDate;
}

public void setLastBuildDate(String lastBuildDate) {
this.lastBuildDate = lastBuildDate;
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

public String getGenerator() {
return generator;
}

public void setGenerator(String generator) {
this.generator = generator;
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

public String getPubDate() {
return pubDate;
}

public void setPubDate(String pubDate) {
this.pubDate = pubDate;
}

public Integer getTtl() {
return ttl;
}

public void setTtl(Integer ttl) {
this.ttl = ttl;
}

public FeedburnerInfo getFeedburnerInfo() {
return feedburnerInfo;
}

public void setFeedburnerInfo(FeedburnerInfo feedburnerInfo) {
this.feedburnerInfo = feedburnerInfo;
}

public List<Atom10Link> getAtom10Link() {
return atom10Link;
}

public void setAtom10Link(List<Atom10Link> atom10Link) {
this.atom10Link = atom10Link;
}

}