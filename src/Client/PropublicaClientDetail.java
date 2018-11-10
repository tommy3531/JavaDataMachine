package Client;

//import org.apache.http.client.methods.HttpGet;

import org.apache.http.client.methods.HttpGet;

public class PropublicaClientDetail {

    public PropublicaClientDetail() {

    }

    public HttpGet getSenatorDetail(String legID) {

        HttpGet request = new HttpGet("https://api.propublica.org/congress/v1/members/" + legID + ".json");
        request.addHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra");
        return request;
    }
}
