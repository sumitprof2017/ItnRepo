/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.itn;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.test.model.Example;
import com.test.model.Item;
import com.test.model.News;
import com.test.model.NewsResponse;
import com.test.model.Rss;
import com.test.model.RssNews;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
//import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.xml.parsers.ParserConfigurationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;



@RestController
@RequestMapping(value = "/news")
public class NewController {
     
    @RequestMapping(value = "/tester")
    public NewsResponse news() throws IOException, ParserConfigurationException, SAXException{
         NewsResponse newsResponse = new NewsResponse();
        try {
            String newsApi = "https://setopati.com/feed";
            
            URL url = new URL(newsApi);
            
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            System.out.println(" url.openConnection()"+conn);
            conn.setDoOutput(true);
            

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code:"+responseCode);
             BufferedReader in = new BufferedReader(
	 new InputStreamReader(conn.getInputStream(),Charset.forName("UTF-8")));
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
//            JsonParser jsonParser = new JsonParser();
//            JsonObject xmlJsonObj = (JsonObject)jsonParser.parse(xmlJSONObj.toString());
             Gson gson = new Gson();
             GsonBuilder builder = new GsonBuilder();
             Example o = builder.setPrettyPrinting().create().fromJson(jsonobject, Example.class);
                 System.out.println("rss obj"+o.toString());
                 System.out.println(o.getRss().getXmlnsAtom());
                 System.out.println(o.getRss().getChannel().getItem().get(0));
                
                             
//                 System.out.println(rss.getXmlnsDc());
                
                 System.out.println("nepali description:"+o.getRss().getChannel().getItem().get(0).getDescription());
            
              List<News> newsList = new ArrayList<>();
              News news = new News();
             for(int i =0;i<o.getRss().getChannel().getItem().size();i++){
             news.setCategory(o.getRss().getChannel().getItem().get(i).getCategory());
             news.setDescription(o.getRss().getChannel().getItem().get(i).getDescription());
             news.setGuid(o.getRss().getChannel().getItem().get(i).getGuid());
//             news.setImage(o.getRss().getChannel().getItem().get(0).ge());
             news.setLink(o.getRss().getChannel().getItem().get(i).getLink());
             news.setPublished_date(o.getRss().getChannel().getItem().get(i).getPubDate());
//             news.setSource(o.getRss().getChannel().getItem().get(0).());
             news.setTitle(o.getRss().getChannel().getItem().get(i).getTitle());

         newsList.add(news);}
             
             
       newsResponse.setPage("1");
        newsResponse.setData(newsList);
        newsResponse.setTotal(1);
      newsResponse.setSource(new String[]{"onlinekhabar","setopati","nepaljapan","ratopati","ajakoartha","spacekhabar"});
           
           


            
        } catch (JSONException je) {
            System.out.println(je.toString());
        }

        }
            catch (IOException ex) {
            Logger.getLogger(NewController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("try not working");
        }
    return newsResponse;}
}
