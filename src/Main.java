import DataModel.PropublicaDetail.PropublicaDetailRoot;
import Manager.PropublicaManager;
import Worker.PropublicaWorkerDetail;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws Exception {

        PropublicaManager propublicaManager = new PropublicaManager();
        PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
        PropublicaDetailRoot propublicaDetailRoot = propublicaWorkerDetail.getSenatorRoles();
//        System.out.println(propublicaDetailRoot.getStatus());
//        ArrayList<String> roles = propublicaWorkerDetail.findSenatorRoles(propublicaDetailRoot);
        ArrayList<String> committees = propublicaWorkerDetail.findSenatorCommittees(propublicaDetailRoot);
//        ArrayList<String> rolesCommitteesSubCommittees = propublicaWorkerDetail.findSenatorRolesCommitteesAndSubcommittees(propublicaDetailRoot);
        System.out.println(committees);
//        ArrayList<Member> members = propublicaManager.getMembers();
////        List<String> firstName = propublicaManager.getMemberFirstName(members);
//        List<String> lastName = propublicaManager.getMemberLastName(members);
////        System.out.println(firstName);
//        List<String> fullName = propublicaManager.getMemberFullName(members);
//        List<String> social = propublicaManager.getMemberBasicInformation(members);
//        System.out.println(social);


    }
}