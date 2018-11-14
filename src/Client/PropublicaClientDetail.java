package Client;

//import org.apache.http.client.methods.HttpGet;

import DataModel.PropublicaDetail.PropublicaDetailRoot;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class PropublicaClientDetail {

    public PropublicaClientDetail() {

    }

    public PropublicaDetailRoot getSenatorDetail(String legID) {

        HttpGet request = new HttpGet("https://api.propublica.org/congress/v1/members/" + legID + ".json");
        request.addHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        PropublicaDetailRoot propublicaDetailRoot = new PropublicaDetailRoot();

        try {

            HttpClient client = new DefaultHttpClient();

            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                propublicaDetailRoot = objectMapper.readValue(result, PropublicaDetailRoot.class);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        return propublicaDetailRoot;    }
}
