import Client.MapLightClient;
import TypeCreater.SenatorBasicInformation;
import TypeCreater.SenatorCommittees;
import TypeCreater.SenatorFec;
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

        // Specific Senator
        PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
        PropublicaDetailRoot propublicaDetailRoot = propublicaWorkerDetail.getSenatorRoles();
        ArrayList<SenatorCommittees> committees = propublicaWorkerDetail.findSenatorCommittees(propublicaDetailRoot);
        System.out.println(committees);

        // Specific Senator full Name
        String fullname = propublicaWorkerDetail.findSenatorFullName(propublicaDetailRoot);
        System.out.println(fullname);

        // Specific Senator FecID
        FecWorker fecWorker = new FecWorker();
        FecRoot fecRoot = fecWorker.getSenatorRoles(fullname);
        ArrayList<SenatorFec> fecID = fecWorker.getFecID(fecRoot);
        String idString = fecID.get(0).getFecId();
        System.out.println(idString);

        // TODO: Need to send fecID to maplightclient
        MapLightClient mapLightClient = new MapLightClient();
        mapLightClient.getMapLight(idString);

    }
}