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

    public String getSenatorBills(String legID) {

        HttpGet request = new HttpGet("https://api.propublica.org/congress/v1/members/" + legID + "/bills/cosponsored.json");
        request.addHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        String jsonBill = "";

        try {

            HttpClient client = new DefaultHttpClient();

            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                jsonBill = EntityUtils.toString(entity);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        return jsonBill;
    }
}
