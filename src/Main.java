import API.PropublicaAPI;
import Client.LegiScanClient;
import Client.PropublicaStateClient;
import DataModel.Fec.FecRoot;
import DataModel.Propublica.Member;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import TypeCreater.*;
import Worker.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

//        PropublicaAPI propublicaAPI = new PropublicaAPI();
//
//        // All Senators
//        PropublicaWorker propublicaWorker = new PropublicaWorker();
//        ArrayList<Member> members = propublicaWorker.getMembers();
////        ArrayList<SenatorFullName> senatorFullNames = propublicaWorker.getSenatorFullName(members);
//        ArrayList<SenatorBasicInformation> senatorBasicInformations = propublicaWorker.getSenatorBasicInformation(members);
////        System.out.println(senatorBasicInformations);
//
//        // Specific Senator
//        String legId = propublicaAPI.getLegID();
//
//        PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
//        PropublicaDetailRoot propublicaDetailRoot = propublicaWorkerDetail.getSenatorRoles(legId);
////        ArrayList<SenatorCommittees> committees = propublicaWorkerDetail.findSenatorCommittees(propublicaDetailRoot);
//
//        // Specific Senator full Name
//        String fullname = propublicaWorkerDetail.findSenatorFullName(propublicaDetailRoot);
//
//        // Specific Senator FecID
//        FecWorker fecWorker = new FecWorker();
//        FecRoot fecRoot = fecWorker.getSenatorRoles(fullname);
//        ArrayList<SenatorFec> fecID = fecWorker.getFecID(fecRoot);
//        String fecIdString = fecID.get(0).getFecId();
//
//        // Maplight
//        MaplightWorker maplightWorker = new MaplightWorker();
//        ArrayList<SenatorFinance> senatorFinances = maplightWorker.extractDataFromMapLight(fecIdString);
//        for(SenatorFinance root: senatorFinances){
//            System.out.println(root.getDonorName());
//        }
//
//        // Bill Information from a specific Senator
//        PropublicaBillWorker propublicaBillWorker = new PropublicaBillWorker();
//        ArrayList<SenatorBill> senatorBills = propublicaBillWorker.getSenatorBills(legId);
//        for(SenatorBill bill: senatorBills) {
//            System.out.println(bill.getBillTitle());
//        }

        // List of senators by state
        String state = "mo";
        PropublicaStateClient propublicaStateClient = new PropublicaStateClient();
        String stateInfo = propublicaStateClient.getSenatorsByState(state);
//        System.out.println(stateInfo);

        LegiScanClient legiScanClient = new LegiScanClient();
        String legiScanJson = legiScanClient.getBillsByState(state);
        System.out.println(legiScanJson);

    }
}