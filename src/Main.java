import Client.MapLightClient;
import DataModel.Maplight.*;
import Helper.MaplightParserHelper;
import TypeCreater.SenatorBasicInformation;
import TypeCreater.SenatorCommittees;
import TypeCreater.SenatorFec;
import TypeCreater.SenatorFullName;
import DataModel.Fec.FecRoot;
import DataModel.Propublica.Member;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import Worker.FecWorker;
import Worker.MaplightWorker;
import Worker.PropublicaWorker;
import Worker.PropublicaWorkerDetail;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


import java.lang.reflect.Array;
import java.util.ArrayList;
import org.json.simple.parser.JSONParser;


public class Main {

    public static void main(String[] args) throws Exception {

        // All Senators
//        PropublicaWorker propublicaWorker = new PropublicaWorker();
//        ArrayList<Member> members = propublicaWorker.getMembers();
//        ArrayList<SenatorFullName> senatorFullNames = propublicaWorker.getSenatorFullName(members);
//        ArrayList<SenatorBasicInformation> senatorBasicInformations = propublicaWorker.getSenatorBasicInformation(members);

        // Specific Senator
//        PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
//        PropublicaDetailRoot propublicaDetailRoot = propublicaWorkerDetail.getSenatorRoles();
//        ArrayList<SenatorCommittees> committees = propublicaWorkerDetail.findSenatorCommittees(propublicaDetailRoot);
//        System.out.println(committees);

        // Specific Senator full Name
//        String fullname = propublicaWorkerDetail.findSenatorFullName(propublicaDetailRoot);
//        System.out.println(fullname);

        // Specific Senator FecID
//        FecWorker fecWorker = new FecWorker();
//        FecRoot fecRoot = fecWorker.getSenatorRoles(fullname);
//        ArrayList<SenatorFec> fecID = fecWorker.getFecID(fecRoot);
//        String fecIdString = fecID.get(0).getFecId();
//        System.out.println(fecIdString);

        // Maplight
        String fecString = "S6IN00191";
        MaplightWorker maplightWorker = new MaplightWorker();
        ArrayList<MaplightRoot> t = maplightWorker.ExtractDataFromMapLight(fecString);

    }
}