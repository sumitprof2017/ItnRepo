/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.itn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/nepaljapan")
public class NepalJapanRssController {
     @RequestMapping(value = "/tester")
     public void NepalJapan(){
         try {
              String newsApi = "https://www.nepaljapan.com/feed";
                URL url = new URL(newsApi);
            
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            System.out.println(" url.openConnection()"+conn);
            conn.setDoOutput(true);
            

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code:"+responseCode);
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
         } catch (Exception e) {
         }
     }
}
