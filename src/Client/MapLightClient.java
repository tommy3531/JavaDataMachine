package Client;

import DataModel.Maplight.MaplightRoot;
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

// String doc = "http://classic.maplight.org/apis/bill-positions/documentation";
//               https://maplight.org/data_guide/contribution-search-api-documentation/
// https://api.maplight.org/maplight-api/fec/contributions?candidate_fecid=<fecid>

public class MapLightClient {


    public MapLightClient() {

    }

    // get All Members
    public String getMapLight(String fec_id) {

        String apiKey = "749c8922e21180e9d722fd726553f7c4";
        HttpGet request = new HttpGet("https://api.maplight.org/maplight-api/fec/contributions?candidate_fecid=" + fec_id);

        request.addHeader("x-api-key", apiKey);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ArrayList<MaplightRoot> terms = new ArrayList<>();
        String indented = "";

        try {

            HttpClient client = new DefaultHttpClient();
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                indented = EntityUtils.toString(entity);
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        return indented;
    }
}
