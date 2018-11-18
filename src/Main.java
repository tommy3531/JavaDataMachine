import API.PropublicaAPI;
import Client.PropublicaBillClient;
import DataModel.Fec.FecRoot;
import DataModel.PropublicaBill.PropublicaBillRoot;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import TypeCreater.SenatorBill;
import TypeCreater.SenatorFec;
import TypeCreater.SenatorFinance;
import Worker.FecWorker;
import Worker.MaplightWorker;
import Worker.PropublicaBillWorker;
import Worker.PropublicaWorkerDetail;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        // All Senators
//        PropublicaWorker propublicaWorker = new PropublicaWorker();
//        ArrayList<Member> members = propublicaWorker.getMembers();
//        ArrayList<SenatorFullName> senatorFullNames = propublicaWorker.getSenatorFullName(members);
//        ArrayList<SenatorBasicInformation> senatorBasicInformations = propublicaWorker.getSenatorBasicInformation(members);

        // Specific Senator
        PropublicaAPI propublicaAPI = new PropublicaAPI();
        String legId = propublicaAPI.getLegID();

        PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
        PropublicaDetailRoot propublicaDetailRoot = propublicaWorkerDetail.getSenatorRoles(legId);
//        ArrayList<SenatorCommittees> committees = propublicaWorkerDetail.findSenatorCommittees(propublicaDetailRoot);

        // Specific Senator full Name
        String fullname = propublicaWorkerDetail.findSenatorFullName(propublicaDetailRoot);

        // Specific Senator FecID
        FecWorker fecWorker = new FecWorker();
        FecRoot fecRoot = fecWorker.getSenatorRoles(fullname);
        ArrayList<SenatorFec> fecID = fecWorker.getFecID(fecRoot);
        String fecIdString = fecID.get(0).getFecId();

        // Maplight
        MaplightWorker maplightWorker = new MaplightWorker();
        ArrayList<SenatorFinance> senatorFinances = maplightWorker.extractDataFromMapLight(fecIdString);
        for(SenatorFinance root: senatorFinances){
            System.out.println(root.getDonorName());
        }

        PropublicaBillWorker propublicaBillWorker = new PropublicaBillWorker();
        ArrayList<SenatorBill> senatorBills = propublicaBillWorker.getSenatorBills(legId);
        for(SenatorBill bill: senatorBills) {
            System.out.println(bill.getBillTitle());
        }

    }
}