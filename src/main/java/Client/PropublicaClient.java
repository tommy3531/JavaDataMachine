package Client;

import DataModel.Propublica.PropublicaRoot;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class PropublicaClient {

    public PropublicaClient() {

    }

    // get All Members
    public PropublicaRoot getSenators() {

        HttpGet request = new HttpGet("https://api.propublica.org/congress/v1/115/senate/members.json");
        request.addHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        PropublicaRoot propublica = new PropublicaRoot();

        try {

            HttpClient client = new DefaultHttpClient();

            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                propublica = objectMapper.readValue(result, PropublicaRoot.class);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        return propublica;
    }
}
