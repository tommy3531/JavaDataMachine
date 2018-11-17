import API.PropublicaAPI;
import Client.PropublicaBillClient;
import DataModel.PropublicaBill.PropublicaBillRoot;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import Worker.PropublicaWorkerDetail;

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
//        String fullname = propublicaWorkerDetail.findSenatorFullName(propublicaDetailRoot);
//        System.out.println(fullname);

        // Specific Senator FecID
//        FecWorker fecWorker = new FecWorker();
//        FecRoot fecRoot = fecWorker.getSenatorRoles(fullname);
//        ArrayList<SenatorFec> fecID = fecWorker.getFecID(fecRoot);
//        String fecIdString = fecID.get(0).getFecId();
//        System.out.println(fecIdString);

        // Maplight
//        String fecString = "S6IN00191";
//        MaplightWorker maplightWorker = new MaplightWorker();
//        ArrayList<MaplightRoot> t = maplightWorker.extractDataFromMapLight(fecIdString);
//        for(MaplightRoot root: t){
//            System.out.println(root.getDonorName());
//        }

        PropublicaBillClient billClient = new PropublicaBillClient();
        PropublicaBillRoot propublicaBillRoot;
        propublicaBillRoot = billClient.getSenatorBills(legId);
        System.out.println(propublicaBillRoot.getStatus());

    }
}