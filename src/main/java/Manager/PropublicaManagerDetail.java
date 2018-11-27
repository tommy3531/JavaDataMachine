//package Manager;
//
//import com.company.DataModel.Propublica.MemberDetail.PropublicaMemberDetail;
//import com.company.DataModel.Propublica.SenatorDetail.SenatorDetailRole;
//import com.company.Worker.PropublicaWorkerDetail;
//import java.util.ArrayList;
//
//public class PropublicaManagerDetail {
//
//
//    public PropublicaMemberDetail propublicaMemberDetail;
//    public PropublicaWorkerDetail propublicaWorkerDetail;
//
//
//    public PropublicaManagerDetail() {
//
//        propublicaWorkerDetail = new PropublicaWorkerDetail();
//        propublicaMemberDetail = propublicaWorkerDetail.getSenatorRoles();
//    }
//
//    public ArrayList<String> getSenatorRolesAndCommittees(){
//        ArrayList<String> senatorRolesAndCommittees;
//        senatorRolesAndCommittees = propublicaWorkerDetail.findSenatorRolesAndCommittees(propublicaMemberDetail);
//        return senatorRolesAndCommittees;
//    }
//
//    public ArrayList<SenatorDetailRole> getSenatorRoles() {
//        ArrayList<SenatorDetailRole> senatorRoles;
//        senatorRoles = propublicaWorkerDetail.findSenatorRoles(propublicaMemberDetail);
//        return senatorRoles;
//    }
//}
