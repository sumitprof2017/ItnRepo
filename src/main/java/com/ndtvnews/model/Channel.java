/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndtvnews.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Channel {

@SerializedName("recordcount")
@Expose
private Integer recordcount;
@SerializedName("item")
@Expose
private List<Item> item = null;
@SerializedName("lastBuildDate")
@Expose
private String lastBuildDate;
@SerializedName("feedburner:info")
@Expose
private FeedburnerInfo feedburnerInfo;
@SerializedName("timezone")
@Expose
private String timezone;
@SerializedName("link")
@Expose
private String link;
@SerializedName("title")
@Expose
private String title;
@SerializedName("atom10:link")
@Expose
private List<Atom10Link> atom10Link = null;
@SerializedName("newsAppVersion")
@Expose
private Double newsAppVersion;

public Integer getRecordcount() {
return recordcount;
}

public void setRecordcount(Integer recordcount) {
this.recordcount = recordcount;
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

public FeedburnerInfo getFeedburnerInfo() {
return feedburnerInfo;
}

public void setFeedburnerInfo(FeedburnerInfo feedburnerInfo) {
this.feedburnerInfo = feedburnerInfo;
}

public String getTimezone() {
return timezone;
}

public void setTimezone(String timezone) {
this.timezone = timezone;
}

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

public List<Atom10Link> getAtom10Link() {
return atom10Link;
}

public void setAtom10Link(List<Atom10Link> atom10Link) {
this.atom10Link = atom10Link;
}

public Double getNewsAppVersion() {
return newsAppVersion;
}

public void setNewsAppVersion(Double newsAppVersion) {
this.newsAppVersion = newsAppVersion;
}

}