package Worker;

import Client.PropublicaBillClient;
import DataModel.PropublicaBill.PropublicaBillResult;
import DataModel.PropublicaBill.PropublicaBillRoot;
import TypeCreater.SenatorBill;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PropublicaBillWorker {

    PropublicaBillClient propublicaBillClient = new PropublicaBillClient();
    PropublicaBillRoot propublicaBillRoot;

    public PropublicaBillWorker() {

    }

    public void getSenatorBills(String id) throws ParseException {

        ArrayList<PropublicaBillResult> propublicaBillResults;
        ArrayList<PropublicaWorkerDetail> propublicaWorkerDetails;

        ArrayList<SenatorBill> senatorBills = new ArrayList<>();
        String jsonBill = propublicaBillClient.getSenatorBills(id);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(jsonBill);

        JSONArray billRoot = (JSONArray) jsonObject.get("results");
        for(Object item: billRoot) {
            JSONObject c = (JSONObject)item;
            String idString = (String) c.get("id");
            JSONArray billDetail = (JSONArray) c.get("bills");
            for(Object itemDetail: billDetail) {
                JSONObject cDetail = (JSONObject)itemDetail;
                String congress = (String) cDetail.get("congress");
                System.out.println("StringID: " + idString + " " + "Congress: " + congress);
            }

            // When I create new arrayList add to new to to see if there are duplicates
//            Set inputSet = new HashSet(inputList);

        }
//        for(Object itemDetail: billDetail){
//            System.out.println(itemDetail.toString());
//        }

        // TODO: Start Parsing
        System.out.println(jsonBill);





    }


}
