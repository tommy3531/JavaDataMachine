package Worker;

import Client.MapLightClient;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MaplightWorker {

    public MapLightClient mapLightClient = new MapLightClient();
    public String mapLightJsonString = "";

    public MaplightWorker() {

    }

    public void getJSONFromMaplightClient(String fec_id) throws ParseException {
        mapLightJsonString = mapLightClient.getMapLight(fec_id);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(mapLightJsonString);

        JSONObject search_terms = (JSONObject)jsonObject.get("search_terms");
        String candidate_fec_id = (String) search_terms.get("candidate_fec_id");
        String candidate_maplight_id = (String) search_terms.get("candidate_maplight_id");
        Long downloads_rows = (Long) search_terms.get("download_rows");
        System.out.println(downloads_rows);

        JSONObject donor = (JSONObject)search_terms.get("donor");
        String donor_organization = (String)donor.get("donor_organization");
        String donor_text = (String)donor.get("donor_text");
        System.out.println(donor_text);

        JSONObject data = (JSONObject)jsonObject.get("data");

        JSONArray ag = (JSONArray)data.get("aggregate_totals");

        for(Object item: ag) {
            JSONObject c = (JSONObject)item;
            // Aggregate_Totals
            Long contributions = (Long) c.get("contributions");
            Double total_amount = (Double) c.get("total_amount");
        }

        JSONArray rows = (JSONArray)data.get("rows");
        for(Object item: rows) {
            JSONObject c = (JSONObject)item;
            Long transactionAmount = (Long) c.get("TransactionAmount");
            String donorOrganization = (String) c.get("DonorOrganization");
            Long candidateMapLightID = (Long) c.get("CandidateMaplightID");
            String donorName = (String) c.get("DonorName");
            String candidateFECID = (String) c.get("CandidateFECID");
            String candidateName = (String) c.get("CandidateName");
            Long electionCycle = (Long) c.get("ElectionCycle");
            String transactionDate = (String) c.get("TransactionDate");

        }

        System.out.println(jsonObject);
    }
}
