/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rediff.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

@SerializedName("rss")
@Expose
private Rss rss;

public Rss getRss() {
return rss;
}

public void setRss(Rss rss) {
this.rss = rss;
}

}