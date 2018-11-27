package Client;

// Documention: https://api.open.fec.gov/developers/#/

import DataModel.Fec.FecRoot;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class FecClient {

    String apikey = "https://api.open.fec.gov/v1/names/candidates/?api_key=8XLhihpZD5w2y2EIknNq5oIMazANpLJhzJjPvGTn&q=Donald%20Trump";

    public FecClient() {

    }

    public FecRoot findFecId(String fullName) throws UnsupportedEncodingException, MalformedURLException {
        String baseURL = "https://api.open.fec.gov/v1/names/candidates/?api_key=8XLhihpZD5w2y2EIknNq5oIMazANpLJhzJjPvGTn&q=";
        String query = fullName;
        URL url = new URL(baseURL + URLEncoder.encode(query));

        HttpGet request = new HttpGet(String.valueOf(url));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        FecRoot fecRoot = new FecRoot();

        try {

            HttpClient client = new DefaultHttpClient();

            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
//                System.out.println(result);
                fecRoot = objectMapper.readValue(result, FecRoot.class);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        return fecRoot;

    }
}
