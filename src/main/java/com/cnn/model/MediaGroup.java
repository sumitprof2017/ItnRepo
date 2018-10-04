/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnn.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaGroup {

@SerializedName("media:content")
@Expose
private List<MediaContent> mediaContent = null;

public List<MediaContent> getMediaContent() {
return mediaContent;
}

public void setMediaContent(List<MediaContent> mediaContent) {
this.mediaContent = mediaContent;
}

}