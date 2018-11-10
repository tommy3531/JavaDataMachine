//package DataModel.NewsAPI.Headline;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//import com.company.DataModel.NewsAPI.Headline.NewsAPITopHeadlineArticle;
//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "status",
//        "totalResults",
//        "articles"
//})
//public class NewsAPITopHeadLineRoot {
//
//    @JsonProperty("status")
//    private String status;
//    @JsonProperty("totalResults")
//    private Integer totalResults;
//    @JsonProperty("articles")
//    private ArrayList<NewsAPITopHeadlineArticle> articles = null;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    @JsonProperty("status")
//    public String getStatus() {
//        return status;
//    }
//
//    @JsonProperty("status")
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    @JsonProperty("totalResults")
//    public Integer getTotalResults() {
//        return totalResults;
//    }
//
//    @JsonProperty("totalResults")
//    public void setTotalResults(Integer totalResults) {
//        this.totalResults = totalResults;
//    }
//
//    @JsonProperty("articles")
//    public ArrayList<NewsAPITopHeadlineArticle> getArticles() {
//        return articles;
//    }
//
//    @JsonProperty("articles")
//    public void setArticles(ArrayList<NewsAPITopHeadlineArticle> articles) {
//        this.articles = articles;
//    }
//
//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
//
//}
//
