import DataModel.PropublicaDetail.PropublicaDetailRoot;
import Manager.PropublicaManager;
import Worker.PropublicaWorkerDetail;


public class Main {

    public static void main(String[] args) throws Exception {
        PropublicaManager propublicaManager = new PropublicaManager();
        PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
        PropublicaDetailRoot detailRoot = propublicaWorkerDetail.getSenatorRoles();
        System.out.println(detailRoot.getStatus());

//        ArrayList<Member> members = propublicaManager.getMembers();
////        List<String> firstName = propublicaManager.getMemberFirstName(members);
//        List<String> lastName = propublicaManager.getMemberLastName(members);
////        System.out.println(firstName);
//        List<String> fullName = propublicaManager.getMemberFullName(members);
//        List<String> social = propublicaManager.getMemberBasicInformation(members);
//        System.out.println(social);


    }
}