package Worker;


import API.PropublicaAPI;
import Client.PropublicaClientDetail;
import DataModel.Propublica.PropublicaDetailRole;
import DataModel.Propublica.PropublicaDetailRoot;
import org.apache.http.client.methods.HttpGet;

import java.util.ArrayList;

public class PropublicaWorkerDetail {

    public PropublicaAPI propublicaAPI;
    public PropublicaClientDetail clientDetail;
    public String legID;


    public PropublicaWorkerDetail() {

        propublicaAPI = new PropublicaAPI();
        clientDetail = new PropublicaClientDetail();

    }


    public PropublicaDetailRoot getSenatorRoles() {
        PropublicaDetailRoot memberDetails;

        legID = propublicaAPI.getLegID();

        memberDetails = clientDetail.getSenatorDetail(legID);
        return memberDetails;

    }
}
//
//    public ArrayList<SenatorDetailRole> findSenatorRoles(PropublicaMemberDetail senatorDetails) {
//        ArrayList<SenatorDetailRole> senatorRoles = new ArrayList<SenatorDetailRole>();
//        ArrayList<PropublicaMemberResults> results;
//        ArrayList<PropublicaMemberRole> roles;
//
//        results = senatorDetails.getResults();
//        for(PropublicaMemberResults result: results){
//            String firstName = result.getFirstName();
//            String lastName = result.getLastName();
//            roles = result.getRoles();
//            for(PropublicaMemberRole role: roles){
//                String roleTitle = role.getTitle();
//                String startDate = role.getStartDate();
//                SenatorDetailRole senatorDetailRole = new SenatorDetailRole(firstName, lastName, roleTitle, startDate);
//                senatorRoles.add(senatorDetailRole);
//            }
//        }
//
//        return senatorRoles;
//    }
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
