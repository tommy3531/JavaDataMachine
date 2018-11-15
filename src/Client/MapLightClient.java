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

// String doc = "http://classic.maplight.org/apis/bill-positions/documentation";
//               https://maplight.org/data_guide/contribution-search-api-documentation/
// https://api.maplight.org/maplight-api/fec/contributions?candidate_fecid=<fecid>

public class MapLightClient {


    public MapLightClient() {

    }

    // get All Members
    public void getMapLight() {

        String apiKey = "749c8922e21180e9d722fd726553f7c4";

        HttpGet request = new HttpGet("https://api.maplight.org/maplight-api/fec/contributions?candidate_fecid=H6MS01131");
        request.addHeader("x-api-key", apiKey);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        PropublicaRoot propublica = new PropublicaRoot();

        try {

            HttpClient client = new DefaultHttpClient();

            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                System.out.println(result);
//                propublica = objectMapper.readValue(result, PropublicaRoot.class);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }


}
