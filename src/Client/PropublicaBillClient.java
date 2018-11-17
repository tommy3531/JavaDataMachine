package Client;

import DataModel.Propublica.PropublicaRoot;
import DataModel.PropublicaBill.PropublicaBillRoot;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;

public class PropublicaBillClient {

    public PropublicaBillClient() {

    }

    public PropublicaBillRoot getSenatorBills() {

        HttpGet request = new HttpGet("https://api.propublica.org/congress/v1/members/B001260/bills/cosponsored.json");
        request.addHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        PropublicaBillRoot propublicaBillRoot = new PropublicaBillRoot();

        try {

            HttpClient client = new DefaultHttpClient();

            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                propublicaBillRoot = objectMapper.readValue(result, PropublicaBillRoot.class);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        return propublicaBillRoot;
    }
}