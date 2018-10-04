///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.test.itn;
//
//import com.test.model.News;
//import com.test.model.NewsResponse;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value = "/test")
//public class NewsTest {
//    @RequestMapping(value = "/news")
//
//    public NewsResponse checknewstest(@RequestParam("page") String page){
//        NewsResponse newsResponse = new NewsResponse();
//        List<News> newsList = new ArrayList<>();
//        News news = new News();
//        news.setTitle("संविधान दिवस मनाउँदैनौंः महतो");
//        news.setLink("http://ajakoartha.com/story/3338");
//        news.setCategory("राजनीति");
//        news.setPublished_date("Mon, 17 Sep 2018 16:07:23");
//        news.setGuid("http://ajakoartha.com/story/3338");
//        news.setImage("http://arthacdn.prixa.net/media/albums/rajapa_nepal_WM7kDiCgKP.jpg");
//        news.setDescription("नेपालगञ्ज- राष्ट्रिय जनता पार्टीका वरिष्ठ नेता राजेन्द्र महतोले संविधान संशोधन हुनुपर्ने मागबाट आफ्नो दल पछि नहट्ने बताएका छन् ।&amp;nbsp;आज आयोजित बाँके जिल्लास्तरीय कार्यकर्ता भेलामा उनले भने, &amp;ldquo;हाम्रो मागबमोजिम संविधान संशोधन नभएसम्म हामी संविधान दिवस मनाउँदैनौँ ।&amp;rdquo;&amp;nbsp;अर्का नेता अनिल झाले सरकारले करको दर बढाएर सङ्घीयता असफल पार्ने प्रयास गरेको आरोप...");
//        news.setSource("ajakoartha");
////        newsResponse.setData((List<News>) news);
////        yesari gari rathiee tara yo mildaina kinaki news ko object lai list ma parse garna mildainba 
////          baru list ma news ko object rakhnu 
//        newsList.add(news);
//       newsResponse.setPage(page);
//        newsResponse.setData(newsList);
//        newsResponse.setTotal(1);
//      newsResponse.setSource(new String[]{"onlinekhabar","setopati","nepaljapan","ratopati","ajakoartha","spacekhabar"});
//        return newsResponse;
//    }
//    @RequestMapping(value = "/newsobj")
//     public News checknew(){
//        News news = new News();
//        news.setTitle("संविधान दिवस मनाउँदैनौंः महतो");
//        news.setLink("http://ajakoartha.com/story/3338");
//        news.setCategory("राजनीति");
//        news.setPublished_date("Mon, 17 Sep 2018 16:07:23");
//        news.setGuid("http://ajakoartha.com/story/3338");
//        news.setImage("http://arthacdn.prixa.net/media/albums/rajapa_nepal_WM7kDiCgKP.jpg");
//        news.setDescription("नेपालगञ्ज- राष्ट्रिय जनता पार्टीका वरिष्ठ नेता राजेन्द्र महतोले संविधान संशोधन हुनुपर्ने मागबाट आफ्नो दल पछि नहट्ने बताएका छन् ।&amp;nbsp;आज आयोजित बाँके जिल्लास्तरीय कार्यकर्ता भेलामा उनले भने, &amp;ldquo;हाम्रो मागबमोजिम संविधान संशोधन नभएसम्म हामी संविधान दिवस मनाउँदैनौँ ।&amp;rdquo;&amp;nbsp;अर्का नेता अनिल झाले सरकारले करको दर बढाएर सङ्घीयता असफल पार्ने प्रयास गरेको आरोप...");
//        news.setSource("ajakoartha");
//       
//        return news;
//    }
////        @RequestMapping(value = "/newsresobj")
////       public NewsResponse letsrock(@RequestParam("page") String page){
////        NewsResponse newsResponse = new NewsResponse();
////            System.out.println(page);
////        News news = new News();
////        news.setTitle("संविधान दिवस मनाउँदैनौंः महतो");
////        news.setLink("http://ajakoartha.com/story/3338");
////        news.setCategory("राजनीति");
////        news.setPublished_date("Mon, 17 Sep 2018 16:07:23");
////        news.setGuid("http://ajakoartha.com/story/3338");
////        news.setImage("http://arthacdn.prixa.net/media/albums/rajapa_nepal_WM7kDiCgKP.jpg");
////        news.setDescription("नेपालगञ्ज- राष्ट्रिय जनता पार्टीका वरिष्ठ नेता राजेन्द्र महतोले संविधान संशोधन हुनुपर्ने मागबाट आफ्नो दल पछि नहट्ने बताएका छन् ।&amp;nbsp;आज आयोजित बाँके जिल्लास्तरीय कार्यकर्ता भेलामा उनले भने, &amp;ldquo;हाम्रो मागबमोजिम संविधान संशोधन नभएसम्म हामी संविधान दिवस मनाउँदैनौँ ।&amp;rdquo;&amp;nbsp;अर्का नेता अनिल झाले सरकारले करको दर बढाएर सङ्घीयता असफल पार्ने प्रयास गरेको आरोप...");
////        news.setSource("ajakoartha");
////       newsResponse.setPage(page);
//////        newsResponse.setData((List<News>) news);
////        newsResponse.setTotal(1);
//////       newsResponse.setSource("onlinekhabar","setopati","nepaljapan","ratopati","ajakoartha","spacekhabar");
//////      newsResponse.setSource(new String[]{"onlinekhabar","setopati","nepaljapan","ratopati","ajakoartha","spacekhabar"});
////        return newsResponse;
////    }
//}
