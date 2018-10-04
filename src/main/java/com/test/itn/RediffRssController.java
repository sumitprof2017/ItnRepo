///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.test.itn;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//import com.test.model.Example;
//import com.test.model.News;
//import com.test.model.NewsResponse;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//import javax.net.ssl.HttpsURLConnection;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.XML;
//import org.json.simple.parser.JSONParser;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value = "/rediff")
//public class RediffRssController {
//     @RequestMapping(value = "/tester")
//     public NewsResponse NepalJapan(){
//          NewsResponse newsResponse = new NewsResponse();
//         try {
////             System.setProperty("http.proxyHost", "localhost:");
////              System.setProperty("http.proxyPort", "8084");
//              String rediffurl = "http://www.rediff.com/rss/inrss.xml";
//                
//                URL url = new URL(rediffurl);
//            
//             
//               String bbcurl = "http://feeds.bbci.co.uk/news/england/london/rss.xml";
//               String cnnurl = "http://rss.cnn.com/rss/edition.rss";
//                String ndtvnewsurl = "http://feeds.feedburner.com/ndtvnews-top-stories";
//                 String setopatiurl = "https://setopati.com/feed";
//         
//           
//
//
//            int responseCode = conn.getResponseCode();
//            int responseCodeforsetopati = setopaticonn.getResponseCode();
//            System.out.println("Response Code:"+responseCode);
//            System.out.println("Response Code for setopati:"+responseCodeforsetopati);
//             BufferedReader in = new BufferedReader(
//	 new InputStreamReader(conn.getInputStream()));
//	 String inputLine = in.readLine();
//            System.out.println("INputLine"+inputLine);
//	 StringBuffer response = new StringBuffer();
////            System.out.println("hellow response");
//	 while ((inputLine = in.readLine()) != null) {
//	  response.append(inputLine);
////             System.out.println("response appended");
//	 }
//	in.close();
//          BufferedReader insetopati = new BufferedReader(
//	 new InputStreamReader(setopaticonn.getInputStream()));
//	 String inputLines = insetopati.readLine();
//            System.out.println("INputLine"+inputLine);
//	 StringBuffer responsesetopati = new StringBuffer();
////            System.out.println("hellow response");
//	 while ((inputLine = insetopati.readLine()) != null) {
//	  responsesetopati.append(inputLines);
////             System.out.println("response appended");
//	 }
//	insetopati.close();
//            System.out.println("response  string is:"+response);
//             System.out.println("response setopati:"+responsesetopati);
//             System.out.println("response is string:"+response.toString());
//     
//             String TEST_XML_STRING = response.toString();
//         
//                  try {
//            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
//              System.out.println("rss to json:"+xmlJSONObj);
//                 String jsonPrettyPrintString = xmlJSONObj.toString(4);
//            System.out.println("jsontostring:"+jsonPrettyPrintString);
//             JsonParser jsonParser = new JsonParser();
//    JsonObject jsonobject = (JsonObject)jsonParser.parse(xmlJSONObj.toString());
////            JsonParser jsonParser = new JsonParser();
////            JsonObject xmlJsonObj = (JsonObject)jsonParser.parse(xmlJSONObj.toString());
//             Gson gson = new Gson();
//             GsonBuilder builder = new GsonBuilder();
//             Example o = builder.setPrettyPrinting().create().fromJson(jsonobject, Example.class);
//                 System.out.println("rss obj"+o.toString());
//                 System.out.println(o.getRss().getXmlnsAtom());
//                 System.out.println(o.getRss().getChannel().getItem().get(0));
//                
//                             
////                 System.out.println(rss.getXmlnsDc());
//                
//                 System.out.println("nepali description:"+o.getRss().getChannel().getItem().get(0).getDescription());
//            
//              List<News> newsList = new ArrayList<>();
//              News news = new News();
//             for(int i =0;i<o.getRss().getChannel().getItem().size();i++){
//             news.setCategory(o.getRss().getChannel().getItem().get(i).getCategory());
//             news.setDescription(o.getRss().getChannel().getItem().get(i).getDescription());
//             news.setGuid(o.getRss().getChannel().getItem().get(i).getGuid());
////             news.setImage(o.getRss().getChannel().getItem().get(0).ge());
//             news.setLink(o.getRss().getChannel().getItem().get(i).getLink());
//             news.setPublished_date(o.getRss().getChannel().getItem().get(i).getPubDate());
////             news.setSource(o.getRss().getChannel().getItem().get(i).ge);
//             news.setTitle(o.getRss().getChannel().getItem().get(i).getTitle());
//
//         newsList.add(news);}
//             
//             
//       newsResponse.setPage("1");
//        newsResponse.setData(newsList);
//        newsResponse.setTotal(1);
//      newsResponse.setSource(new String[]{"onlinekhabar","setopati","nepaljapan","ratopati","ajakoartha","spacekhabar"});
//           
//           
//
//
//            
//        } catch (JSONException je) {
//            System.out.println(je.toString());
//        }
//           
////             System.out.println(xmlJSONObj);
//             
//         } catch (Exception e) {
//         }
//     return newsResponse;}
//}
