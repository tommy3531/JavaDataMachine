package Client;

import API.NewsAPI;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class NewsClient {

    NewsAPI newsAPI;

    public NewsClient() {

        newsAPI = new NewsAPI();
    }

    String api = "2126949bf7be437480eaf1f2dcf0ce51";

    public void getNewsAPITopHeadLine() {

        String country = newsAPI.getCountry();

        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet("https://newsapi.org/v2/top-headlines?country=" + country + "&apiKey=2126949bf7be437480eaf1f2dcf0ce51");

        try {

            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                System.out.println(result);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
////
////    public NewsAPIEverythingRoot getNewsAPIEverything(String search) {
////
////        NewsAPIEverythingRoot newsAPIEverythingRoot = new NewsAPIEverythingRoot();
////
////        ObjectMapper objectMapper = new ObjectMapper();
////        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
////
////        HttpClient client = new DefaultHttpClient();
////        HttpGet request = new HttpGet("https://newsapi.org/v2/everything?q=" + search + "&apiKey=2126949bf7be437480eaf1f2dcf0ce51");
//////        request.addHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra");
////
////        try {
////
////            HttpResponse response = client.execute(request);
////            HttpEntity entity = response.getEntity();
////            if (entity != null) {
////                String result = EntityUtils.toString(entity);
//////                System.out.println(result);
////                newsAPIEverythingRoot = objectMapper.readValue(result, NewsAPIEverythingRoot.class);
////
////            }
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////
////        return newsAPIEverythingRoot;
////
////    }
////}
