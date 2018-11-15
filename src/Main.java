import Client.FecClient;
import Client.MapLightClient;
import DataModel.Propublica.Member;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import Manager.PropublicaManager;
import Worker.PropublicaWorkerDetail;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws Exception {

//        PropublicaManager propublicaManager = new PropublicaManager();
//        ArrayList<Member> members = propublicaManager.getMembers();
//        ArrayList<String> basicInfo = propublicaManager.getMemberBasicInformation(members);
//        System.out.println(basicInfo);

        PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
        PropublicaDetailRoot propublicaDetailRoot = propublicaWorkerDetail.getSenatorRoles();
        ArrayList<String> committees = propublicaWorkerDetail.findSenatorCommittees(propublicaDetailRoot);
        String fullname = propublicaWorkerDetail.findSenatorFullName(propublicaDetailRoot);
        System.out.println(fullname);
//
        FecClient fecClient = new FecClient();
        fecClient.findFecId(fullname);

        // TODO: Need to send fecID to maplightclient
//        MapLightClient mapLightClient = new MapLightClient();
//        mapLightClient.getMapLight();

    }
}