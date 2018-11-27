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

public class PropublicaBillWorker {

    PropublicaBillClient propublicaBillClient = new PropublicaBillClient();
    PropublicaBillRoot propublicaBillRoot;

    public PropublicaBillWorker() {

    }

    public ArrayList<SenatorBill> getSenatorBills(String id) throws ParseException {

        ArrayList<PropublicaBillResult> propublicaBillResults;
        ArrayList<PropublicaWorkerDetail> propublicaWorkerDetails;

        SenatorBill senatorBill = new SenatorBill();

        ArrayList<SenatorBill> senatorBills = new ArrayList<>();
        String jsonBill = propublicaBillClient.getSenatorBills(id);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(jsonBill);

        JSONArray billRoot = (JSONArray) jsonObject.get("results");
        for(Object item: billRoot) {
            JSONObject c = (JSONObject)item;
            String memberId = (String) c.get("id");
            String name = (String) c.get("name");
            Long results = (Long) c.get("num_results");
            JSONArray billDetail = (JSONArray) c.get("bills");
            for(Object itemDetail: billDetail) {

                JSONObject cDetail = (JSONObject)itemDetail;
                String billID = (String) cDetail.get("bill_id");
                String billType = (String) cDetail.get("bill_type");
                String congress = (String) cDetail.get("congress");
                String billNumber = (String) cDetail.get("number");
                String billTitle = (String) cDetail.get("title");
                String billShortTitle = (String) cDetail.get("short_title");
                String cosponsoredDate = (String) cDetail.get("cosponsored_date");
                String sponsorTitle = (String) cDetail.get("sponsor_title");
                String sponsorID = (String) cDetail.get("sponsor_id");
                String sponsorName = (String) cDetail.get("sponsor_name");
                String sponsorState = (String) cDetail.get("sponsor_state");
                String sponsorParty = (String) cDetail.get("sponsor_party");
                String congressDotGovURL = (String) cDetail.get("congressdotgov");
                String govtrackURL = (String) cDetail.get("govtrack_url");
                String committees = (String) cDetail.get("committees");
                String primarySubject = (String) cDetail.get("primary_subject");
                String summary = (String) cDetail.get("summary");
                String summaryShort = (String) cDetail.get("summary_short");
                String latestMajorActionDate = (String) cDetail.get("latest_major_action_date");
                String latestMajorAction = (String) cDetail.get("latest_major_action");
                senatorBill = new SenatorBill(memberId, name, results, billID, billType, congress, billNumber, billTitle, billShortTitle, cosponsoredDate, sponsorTitle, sponsorID, sponsorName, sponsorState, sponsorParty, congressDotGovURL, govtrackURL, committees, primarySubject, summary, summaryShort, latestMajorActionDate, latestMajorAction);

                senatorBills.add(senatorBill);

            }

        }

        return senatorBills;

    }


}
