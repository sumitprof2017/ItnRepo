/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rediff.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Channel {

@SerializedName("copyright")
@Expose
private String copyright;
@SerializedName("item")
@Expose
private List<Item> item ;
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
@SerializedName("managingEditor")
@Expose
private String managingEditor;
@SerializedName("pubDate")
@Expose
private String pubDate;
@SerializedName("webMaster")
@Expose
private String webMaster;
@SerializedName("atom:link")
@Expose
private AtomLink atomLink;
@SerializedName("docs")
@Expose
private String docs;

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

public String getManagingEditor() {
return managingEditor;
}

public void setManagingEditor(String managingEditor) {
this.managingEditor = managingEditor;
}

public String getPubDate() {
return pubDate;
}

public void setPubDate(String pubDate) {
this.pubDate = pubDate;
}

public String getWebMaster() {
return webMaster;
}

public void setWebMaster(String webMaster) {
this.webMaster = webMaster;
}

public AtomLink getAtomLink() {
return atomLink;
}

public void setAtomLink(AtomLink atomLink) {
this.atomLink = atomLink;
}

public String getDocs() {
return docs;
}

public void setDocs(String docs) {
this.docs = docs;
}

}