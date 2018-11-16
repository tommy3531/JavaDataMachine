import Client.FecClient;
import Client.MapLightClient;
import DataModel.Fec.FecRoot;
import DataModel.Propublica.Member;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import Worker.FecWorker;
import Worker.PropublicaWorker;
import Worker.PropublicaWorkerDetail;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<String> firstNames;
        PropublicaWorker propublicaWorker = new PropublicaWorker();
        ArrayList<Member> members = propublicaWorker.getMembers();
        firstNames = propublicaWorker.getSenatorFirstName(members);
        System.out.println(firstNames);


        PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
        PropublicaDetailRoot propublicaDetailRoot = propublicaWorkerDetail.getSenatorRoles();
        ArrayList<String> committees = propublicaWorkerDetail.findSenatorCommittees(propublicaDetailRoot);
        String fullname = propublicaWorkerDetail.findSenatorFullName(propublicaDetailRoot);
        System.out.println(fullname);

        FecWorker fecWorker = new FecWorker();
        FecRoot fecRoot = fecWorker.getSenatorRoles(fullname);
        ArrayList<String> fecID = fecWorker.getFecID(fecRoot);
        System.out.println(fecID);


        // TODO: Need to send fecID to maplightclient
//        MapLightClient mapLightClient = new MapLightClient();
//        mapLightClient.getMapLight();

    }
}