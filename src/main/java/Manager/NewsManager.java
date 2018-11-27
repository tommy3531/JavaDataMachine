package Manager;//package com.company.Manager;
//
//import com.company.DataModel.NewsAPI.Headline.NewsAPITopHeadlineArticle;
//
//import java.util.ArrayList;
//
//public class NewsManager {
//
//    ArrayList<String> authors;
//    ArrayList<String> titles;
//    ArrayList<String> urls;
//    ArrayList<String> descriptions;
//
//    NewsWorker newsWorker;
//
//    public NewsManager() {
//
//        newsWorker = new NewsWorker();
//    }
//
//    public ArrayList<String> getArticles() {
//        ArrayList<NewsAPITopHeadlineArticle> articles;
//        ArrayList<String> article = new ArrayList<String>();
//        articles = newsWorker.getTopHeadLineByCountry();
//        for(NewsAPITopHeadlineArticle item: articles){
//            article.add(item.getDescription());
//        }
//        return article;
//    }
//
//    public void displayArticle(ArrayList<NewsAPITopHeadlineArticle> articles){
//
//        System.out.println("\nPrinting Article\n");
//        for(NewsAPITopHeadlineArticle article: articles) {
//            System.out.println(article.getTitle());
//            System.out.println(article.getAuthor());
//            System.out.println(article.getUrl());
//            System.out.println(article.getDescription() + "\n");
//
//        }
//    }
//
//    public ArrayList<String> getAuthors(ArrayList<NewsAPITopHeadlineArticle> articles) {
//
//        authors = newsWorker.getAuthor(articles);
//        return authors;
//    }
//
//    public void displayAuthors(ArrayList<String> authors) {
//
//        System.out.println("\nPrinting Authors\n");
//        for(String author: authors) {
//            System.out.println(author);
//        }
//    }
//
//    public ArrayList<String> getTitles(ArrayList<NewsAPITopHeadlineArticle> articles) {
//
//        titles = newsWorker.getAuthor(articles);
//        return titles;
//    }
//
//    public void displayTitle(ArrayList<String> titles) {
//        System.out.println("Printing Titles");
//        for(String title: titles) {
//            System.out.println(title);
//        }
//    }
//
//    public ArrayList<String> getURLS(ArrayList<NewsAPITopHeadlineArticle> articles){
////
//        urls = newsWorker.getURL(articles);
//        return urls;
//
//    }
//
//    public void displayURLS(ArrayList<String> urls) {
//
//        System.out.println("Printing Urls");
//        for(String url: urls) {
//            System.out.println(url);
//
//        }
//
//    }
//
//    public ArrayList<String> getDescriptions(ArrayList<NewsAPITopHeadlineArticle> articles){
//
//        descriptions = newsWorker.getDescription(articles);
//        return descriptions;
//
//    }
//
//    public void displayDescription(ArrayList<String> descriptions) {
//        System.out.println("Printing Description");
//        for(String description: descriptions) {
//            System.out.println(description);
//        }
//    }
//}
