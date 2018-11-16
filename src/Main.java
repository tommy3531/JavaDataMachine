import TypeCreater.SenatorBasicInformation;
import TypeCreater.SenatorFullName;
import DataModel.Fec.FecRoot;
import DataModel.Propublica.Member;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import Worker.FecWorker;
import Worker.PropublicaWorker;
import Worker.PropublicaWorkerDetail;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws Exception {

        // All Senators
        PropublicaWorker propublicaWorker = new PropublicaWorker();
        ArrayList<Member> members = propublicaWorker.getMembers();
        ArrayList<SenatorFullName> senatorFullNames = propublicaWorker.getSenatorFullName(members);
        ArrayList<SenatorBasicInformation> senatorBasicInformations = propublicaWorker.getSenatorBasicInformation(members);
        for(SenatorBasicInformation info: senatorBasicInformations){
            System.out.println(info.getLegID());
        }

        // Specific Senator
        PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
        PropublicaDetailRoot propublicaDetailRoot = propublicaWorkerDetail.getSenatorRoles();
        ArrayList<String> committees = propublicaWorkerDetail.findSenatorCommittees(propublicaDetailRoot);

        // Specific Senator full Name
        String fullname = propublicaWorkerDetail.findSenatorFullName(propublicaDetailRoot);
        System.out.println(fullname);

        // Specific Senator FECID
        FecWorker fecWorker = new FecWorker();
        FecRoot fecRoot = fecWorker.getSenatorRoles(fullname);
        ArrayList<String> fecID = fecWorker.getFecID(fecRoot);
        System.out.println(fecID);


        // TODO: Need to send fecID to maplightclient
//        MapLightClient mapLightClient = new MapLightClient();
//        mapLightClient.getMapLight();

    }
}