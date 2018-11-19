package Client;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class LegiScanClient {
    // Documentation: https://legiscan.com/gaits/documentation/legiscan

    String api = "";

    public String getBillsByState(String state) {

        HttpGet request = new HttpGet("https://api.legiscan.com/?key=43779bd9061ccbb3300945e7b0280500&op=getMasterList&state=" + state);
//        request.addHeader("x-api-key", "43779bd9061ccbb3300945e7b0280500");
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
