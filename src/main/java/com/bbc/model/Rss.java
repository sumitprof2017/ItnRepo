/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rss {

@SerializedName("xmlns:atom")
@Expose
private String xmlnsAtom;
@SerializedName("xmlns:media")
@Expose
private String xmlnsMedia;
@SerializedName("channel")
@Expose
private Channel channel;
@SerializedName("xmlns:content")
@Expose
private String xmlnsContent;
@SerializedName("version")
@Expose
private Integer version;
@SerializedName("xmlns:dc")
@Expose
private String xmlnsDc;

public String getXmlnsAtom() {
return xmlnsAtom;
}

public void setXmlnsAtom(String xmlnsAtom) {
this.xmlnsAtom = xmlnsAtom;
}

public String getXmlnsMedia() {
return xmlnsMedia;
}

public void setXmlnsMedia(String xmlnsMedia) {
this.xmlnsMedia = xmlnsMedia;
}

public Channel getChannel() {
return channel;
}

public void setChannel(Channel channel) {
this.channel = channel;
}

public String getXmlnsContent() {
return xmlnsContent;
}

public void setXmlnsContent(String xmlnsContent) {
this.xmlnsContent = xmlnsContent;
}

public Integer getVersion() {
return version;
}

public void setVersion(Integer version) {
this.version = version;
}

public String getXmlnsDc() {
return xmlnsDc;
}

public void setXmlnsDc(String xmlnsDc) {
this.xmlnsDc = xmlnsDc;
}

}
