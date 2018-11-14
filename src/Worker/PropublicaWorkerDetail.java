package Worker;


import API.PropublicaAPI;
import Client.PropublicaClientDetail;
import DataModel.PropublicaDetail.PropublicaDetailResults;
import DataModel.PropublicaDetail.PropublicaDetailRole;
import DataModel.PropublicaDetail.PropublicaDetailRoot;

import java.util.ArrayList;
import java.util.List;

public class PropublicaWorkerDetail {

    public PropublicaAPI propublicaAPI;
    public PropublicaClientDetail clientDetail;
    public String legID;


    public PropublicaWorkerDetail() {

        propublicaAPI = new PropublicaAPI();
        clientDetail = new PropublicaClientDetail();

    }


    public PropublicaDetailRoot getSenatorRoles() {
        PropublicaDetailRoot memberDetailsRoot;

        legID = propublicaAPI.getLegID();

        memberDetailsRoot = clientDetail.getSenatorDetail(legID);
        return memberDetailsRoot;

    }


    public ArrayList<String> findSenatorRoles(PropublicaDetailRoot senatorDetails) {
        ArrayList<PropublicaDetailResults> results;
        ArrayList<PropublicaDetailRole> roles;
        ArrayList<String> senatorRoles = new ArrayList<>();

        results = senatorDetails.getResults();
        for(PropublicaDetailResults result: results){
            String firstName = result.getFirst_name();
            String lastName = result.getLast_name();
            roles = result.getRoles();
            for(PropublicaDetailRole role: roles){
                String roleTitle = role.getTitle();
                String startDate = role.getStart_date();
                senatorRoles.add("firstName: " + firstName + " " + "LastName: " + lastName + " " + "RoleTitle: " + roleTitle + " " + "StartDate: " + startDate);
            }
        }

        return senatorRoles;
    }
}
//
//    public ArrayList<SenatorDetailRole> findSenatorCommittees(PropublicaMemberDetail senatorDetails) {
//        ArrayList<SenatorDetailCommittee> sentorComittees = new ArrayList<SenatorDetailRole>();
//        ArrayList<PropublicaMemberResults> results;
//        ArrayList<PropublicaMemberRole> roles;
//        ArrayList<PropublicaMemberCommittee> committee;
//
//        results = senatorDetails.getResults();
//        for(PropublicaMemberResults result: results){
//            String firstName = result.getFirstName();
//            String lastName = result.getLastName();
//            roles = result.getRoles();
//            for(PropublicaMemberRole role: roles){
//                committee = role.getCommittees();
//                for(PropublicaMemberCommittee item: committee){
//                    item.getName();
//                    item.getTitle();
//                    item.getRankInParty();
//                    item.getSide();
//                }
//            }
//        }
//
//        return senatorRoles;
//    }
//
//    public ArrayList<String> findSenatorRolesAndCommittees(PropublicaMemberDetail senatorDetail) {
//        ArrayList<PropublicaMemberResults> results;
//        ArrayList<PropublicaMemberRole> roles;
//        ArrayList<PropublicaMemberCommittee> committees;
//        ArrayList<PropublicaMemberSubComittee> subComittees;
//
//        ArrayList<String> senatorRolesAndCommittees = new ArrayList<String>();
//        senatorRolesAndCommittees.add("SenatorDetail ID: " + legID);
//        results = senatorDetail.getResults();
//        for(PropublicaMemberResults result: results){
//            senatorRolesAndCommittees.add("SenatorDetail FullName: " + result.getFirstName() + " " + result.getLastName());
//            roles = result.getRoles();
//            for(PropublicaMemberRole role: roles){
//                senatorRolesAndCommittees.add("Role Title: " + role.getTitle());
//                committees = role.getCommittees();
//                for(PropublicaMemberCommittee committee: committees){
//                    senatorRolesAndCommittees.add("Committe: " + committee.getName());
//                }
//                subComittees = role.getSubcommittees();
//                for(PropublicaMemberSubComittee subComittee: subComittees){
//                    senatorRolesAndCommittees.add("Subcommittee: " + subComittee.getName());
//                }
//            }
//        }
//
//        return senatorRolesAndCommittees;
//    }
//
//}
