/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.itn;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/news")
public class NepalJapanRssController {
    @RequestMapping(value = "/nepaljapan")
    public void rssnepaljapan() throws IOException{
      String surl = "http://feeds.bbci.co.uk/news/england/london/rss.xml";
         
           
        try {
           URL url = new URL(surl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
             conn.setDoOutput(true);
            int getresponseCode = conn.getResponseCode();
            System.out.println("Response Code:"+getresponseCode);
             BufferedReader in = new BufferedReader(
	 new InputStreamReader(conn.getInputStream()));
	 String inputLine = in.readLine();
            System.out.println("INputLine"+inputLine);
	 StringBuffer response = new StringBuffer();
//            System.out.println("hellow response");
	 while ((inputLine = in.readLine()) != null) {
	  response.append(inputLine);
          
//             System.out.println("response appended");
	 }
	in.close();
            System.out.println("response is:"+response);
              String TEST_XML_STRING = response.toString();
             try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
              System.out.println("rss to json:"+xmlJSONObj);
                 String jsonPrettyPrintString = xmlJSONObj.toString(4);
            System.out.println("jsontostring:"+jsonPrettyPrintString);
             JsonParser jsonParser = new JsonParser();
    JsonObject jsonobject = (JsonObject)jsonParser.parse(xmlJSONObj.toString());
             }
             catch(JSONException e){
                 
             }
            //convert strinbg to json
            //download dependency
        } catch (MalformedURLException ex) {
            Logger.getLogger(NepalJapanRssController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
}
