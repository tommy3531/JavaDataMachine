//package Store;//package com.company.Store;
//
//import com.company.DataModel.NewsAPI.Headline.NewsAPITopHeadlineArticle;
//import com.company.Manager.NewsManager;
//
//import java.util.ArrayList;
//
//public class NewsStore {
//
//    NewsManager newsManager;
//
//    ArrayList<NewsAPITopHeadlineArticle> articles;
//
//
//    public NewsStore() {
//
//        newsManager = new NewsManager();
//    }
//
//    // TODO: Finish below
//
//    public ArrayList<String> getArticles() {
//        ArrayList<String> article = newsManager.getArticles();
//        return article;
//    }
//
//    public ArrayList<String> getDescription(ArrayList<String> article){
//        ArrayList<String> description = new ArrayList<String>();
//        for(String obj: article){
//            description.add(obj);
//        }
//
//        return description;
//    }
//
////    articles = newsManager.getArticles();
////        newsManager.displayArticle(articles);
////
////    ArrayList<String> authors = newsManager.getAuthors(articles);
////        newsManager.displayAuthors(authors);
////
////    ArrayList<String> titles = newsManager.getTitles(articles);
////        newsManager.displayTitle(titles);
////
////    ArrayList<String> urls = newsManager.getURLS(articles);
////        newsManager.displayURLS(urls);
////    public ArrayList<String> getDescription(ArrayList<String> article) {
////        ArrayList<String> descriptions = newsManager.getDescriptions(articles);
////        //newsManager.displayDescription(descriptions);
////        return descriptions;
////    }
//}
