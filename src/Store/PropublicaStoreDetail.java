//package Store;
//
//import java.util.ArrayList;
//
//public class PropublicaStoreDetail {
//
//    public PropublicaManagerDetail propublicaManagerDetail;
//
//    public PropublicaStoreDetail() {
//
//        propublicaManagerDetail = new PropublicaManagerDetail();
//
//    }
//
//    public ArrayList<SenatorDetailRole> listSenatorRoles() {
//        ArrayList<SenatorDetailRole> roles = propublicaManagerDetail.getSenatorRoles();
//        for(SenatorDetailRole obj: roles) {
//            System.out.println(obj.getFirstName() + " " + obj.getLastName() + "\n" +
//                    obj.getTitle() + "\n" +
//                    obj.getStartDate() + "\n");
//        }
//
//        return roles;
//    }
//
//    public ArrayList<String> listSenatorRolesAndCommittees() {
//        ArrayList<String> test = propublicaManagerDetail.getSenatorRolesAndCommittees();
//        for(String obj: test){
//            System.out.println(obj);
//        }
//
//        return test;
//    }
//
//}
