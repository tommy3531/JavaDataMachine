package Helper;

import Client.MapLightClient;
import DataModel.Maplight.MaplightRoot;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

public class MaplightParserHelper {

    public MapLightClient mapLightClient = new MapLightClient();
    public String mapLightJsonString = "";

    public MaplightParserHelper() {

    }

    public ArrayList<MaplightRoot> ExtractDataFromMapLight(String fec_id) throws ParseException {
        MaplightRoot maplightRoot;
        ArrayList<MaplightRoot> maplightRootArrayList = new ArrayList<>();

        mapLightJsonString = mapLightClient.getMapLight(fec_id);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(mapLightJsonString);

        JSONObject search_terms = (JSONObject)jsonObject.get("search_terms");
        String candidateFecID = (String) search_terms.get("candidate_fec_id");
        String candidateMapLightID = (String) search_terms.get("candidate_maplight_id");
        Long downLoadRows = (Long) search_terms.get("download_rows");

        JSONObject donor = (JSONObject)search_terms.get("donor");
        String donorOrganization = (String)donor.get("donor_organization");
        String donorText = (String)donor.get("donor_text");

        JSONObject data = (JSONObject)jsonObject.get("data");
        JSONArray ag = (JSONArray)data.get("aggregate_totals");

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
            maplightRoot = new MaplightRoot(electionCycle, transactionDate, transactionAmountDonation, donorName, donorOrganizationDonation, candidateNameDonation, candidateMapLightIDDonation, candidateFECIDDonation);
            maplightRootArrayList.add(maplightRoot);
        }

        return maplightRootArrayList;

    }

}
