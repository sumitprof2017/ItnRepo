/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rediff.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rss {

@SerializedName("xmlns:atom")
@Expose
private String xmlnsAtom;
@SerializedName("channel")
@Expose
private Channel channel;
@SerializedName("version")
@Expose
private Integer version;

public String getXmlnsAtom() {
return xmlnsAtom;
}

public void setXmlnsAtom(String xmlnsAtom) {
this.xmlnsAtom = xmlnsAtom;
}

public Channel getChannel() {
return channel;
}

public void setChannel(Channel channel) {
this.channel = channel;
}

public Integer getVersion() {
return version;
}

public void setVersion(Integer version) {
this.version = version;
}

}