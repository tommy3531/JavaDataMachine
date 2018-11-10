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
import java.util.ArrayList;

// Return a HTTP Response

public class PropublicaClient {

    public PropublicaClient propublicaClient;

    public PropublicaClient() {

    }

    // get All Members
    public PropublicaRoot getListOfSenatorsRequest() {

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
                System.out.println(propublica);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return propublica;

    }
}

//    public Propublica getSenatorBill() {
//        // PropublicaBillExample propublicaBillExample = new PropublicaBillExample();
//        Propublica propublica = new Propublica();
//
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//
//        HttpClient client = new DefaultHttpClient();
//        HttpGet request = new HttpGet("https://api.propublica.org/congress/v1/members/" + legID + "/bills/introduced.json");
//        request.addHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra");
//
//        try {
//
//            HttpResponse response = client.execute(request);
//            HttpEntity entity = response.getEntity();
//            if(entity != null) {
//                String result = EntityUtils.toString(entity);
//                propublica = objectMapper.readValue(result, Propublica.class);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return propublica;
//
//    }
//
//    public PropublicaSenatorExpenses getSenatorExpenses(String legID, String year, String quarter) {
//        ArrayList<PropublicaSenatorExpenses> senatorExpensesArray = new ArrayList<PropublicaSenatorExpenses>();
//        PropublicaSenatorExpenses senatorExpenses = new PropublicaSenatorExpenses();
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//
//        HttpClient client = new DefaultHttpClient();
//        HttpGet request = new HttpGet("https://api.propublica.org/congress/v1/members/" + legID + "/office_expenses/" + year +"/"+ quarter + ".json");
//        request.addHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra");
//
//        try {
//
//            HttpResponse response = client.execute(request);
//            HttpEntity entity = response.getEntity();
//            if(entity != null) {
//                String result = EntityUtils.toString(entity);
//                senatorExpenses = objectMapper.readValue(result, PropublicaSenatorExpenses.class);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return senatorExpenses;
//
//    }
//
//
//
////    public PropublicaBillExample getBillBySubject(String subject) {
////        PropublicaBillExample propublicaBillExample = new PropublicaBillExample();
////
////        ObjectMapper objectMapper = new ObjectMapper();
////        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
////
////        HttpClient client = new DefaultHttpClient();
////        HttpGet request = new HttpGet("https://api.propublica.org/congress/v1/bills/subjects/" + subject + ".json");
////        request.addHeader("x-api-key", "SpzjlPZlkMlPKKGCLQS1OqZtCN96lPl7sszOTKra");
////
////        try {
////
////            HttpResponse response = client.execute(request);
////            HttpEntity entity = response.getEntity();
////            if(entity != null) {
////                String result = EntityUtils.toString(entity);
////                propublicaBillExample = objectMapper.readValue(result, PropublicaBillExample.class);
////
////            }
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        return propublicaBillExample;
////
////    }
//
//
//
//
//}
