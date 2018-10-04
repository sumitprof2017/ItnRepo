///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.test.itn;
//
//import com.cnn.model.Example;
//import com.google.gson.Gson;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//import com.test.model.News;
//import com.test.model.NewsResponse;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.XML;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value = "/news")
//public class CnnController {
//   NewsResponse newsResponse = new NewsResponse();
//     @RequestMapping(value = "/cnnnews")
//     public NewsResponse cnnnews() throws IOException{
//      String surl = "http://rss.cnn.com/rss/edition.rss";
//         
//           //make url obj
//        try {
//           URL url = new URL(surl);
//           //http connection wid d url
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//             conn.setDoOutput(true);
//             //check in postman the url https or http might give status code 200
//            int getresponseCode = conn.getResponseCode();
//            System.out.println("Response Code:"+getresponseCode);
//             BufferedReader in = new BufferedReader(
//	 new InputStreamReader(conn.getInputStream()));
//             //receive data got after hitting url
//             //in.readline = read each line by line
//	 String inputLine = in.readLine();
//         
//            System.out.println("INputLine"+inputLine);
//            //sstring buffer is like string but is matuable so to change to json
//	 StringBuffer response = new StringBuffer();
////            System.out.println("hellow response");
////loop till noline inputline bata ak ak line gardai lidai response ma add garxa
//	 while ((inputLine = in.readLine()) != null) {
//	  response.append(inputLine);
//          
////             System.out.println("response appended");
//	 }
//	in.close();
//            System.out.println("response is:"+response);
//            //response j auxa suppose xml tyaslai string ma lane
//              String TEST_XML_STRING = response.toString();
//             try {
//                 //change xml to json
//            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
//              System.out.println("hellow rss to json:"+xmlJSONObj);
//                 String jsonPrettyPrintString = xmlJSONObj.toString(4);
//            System.out.println("jsontostring:"+jsonPrettyPrintString);
//            //Capital json lai parse.tostring garera Small Json object banaune
//             JsonParser jsonParser = new JsonParser();
//    JsonObject jsonobject = (JsonObject)jsonParser.parse(xmlJSONObj.toString());
//    //Gson object banaune vaneko pojo banaera java object banaune json lai
//    
//    //then small json lai gson banaune
//    //map garna pojo haru chainxa
//    
//    Gson gson = new Gson();
//     Example o = gson.fromJson(jsonobject, Example.class);
//      System.out.println("example outside rss obj"+o.toString());
//       List<News> newsList = new ArrayList<>();
//              News news = new News();
//             for(int i =0;i<o.getRss().getChannel().getItem().size();i++){
////             news.setCategory(o.getRss().getChannel().getItem().get(i).getCategory());
//             news.setDescription(o.getRss().getChannel().getItem().get(i).getDescription());
////             news.setGuid(o.getRss().getChannel().getItem().get(i).getGuid());
////             news.setImage(o.getRss().getChannel().getItem().get(0).ge());
//             news.setLink(o.getRss().getChannel().getItem().get(i).getLink());
//             news.setPublished_date(o.getRss().getChannel().getItem().get(i).getPubDate());
////             news.setSource(o.getRss().getChannel().getItem().get(i).());
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
//             }
//             catch(JSONException e){
//                 
//             }
//            //convert strinbg to json
//            //download dependency
//        } catch (MalformedURLException ex) {
//            Logger.getLogger(NepalJapanRssController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            
//        
//   return newsResponse; }
//}
