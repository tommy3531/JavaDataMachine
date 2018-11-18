package Worker;

import Client.MapLightClient;
import TypeCreater.SenatorFinance;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

public class MaplightWorker {

    public MapLightClient mapLightClient = new MapLightClient();
    public String mapLightJsonString = "";

    public MaplightWorker() {

    }

    public ArrayList<SenatorFinance> extractDataFromMapLight(String fec_id) throws ParseException {

        SenatorFinance senatorFinance;
        ArrayList<SenatorFinance> maplightRootArrayList = new ArrayList<>();

        mapLightJsonString = mapLightClient.getMapLight(fec_id);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(mapLightJsonString);
        JSONObject data = (JSONObject)jsonObject.get("data");

        JSONArray rows = (JSONArray)data.get("rows");
        for(Object item: rows) {
            JSONObject c = (JSONObject)item;
            Long electionCycle = (Long) c.get("ElectionCycle");
            String transactionDate = (String) c.get("TransactionDate");
            Long transactionAmountDonation = (Long) c.get("TransactionAmount");
            String donorName = (String) c.get("DonorName");
            String donorOrganizationDonation = (String) c.get("DonorOrganization");
            String candidateNameDonation = (String) c.get("CandidateName");
            Long candidateMapLightIDDonation = (Long) c.get("CandidateMaplightID");
            String candidateFECIDDonation = (String) c.get("CandidateFECID");
            senatorFinance = new SenatorFinance(electionCycle, transactionDate, transactionAmountDonation, donorName, donorOrganizationDonation, candidateNameDonation, candidateMapLightIDDonation, candidateFECIDDonation);
            maplightRootArrayList.add(senatorFinance);
        }

        return maplightRootArrayList;

    }

}
