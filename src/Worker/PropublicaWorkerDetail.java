package Worker;


import API.PropublicaAPI;
import Client.PropublicaClientDetail;
import DataModel.PropublicaDetail.*;

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
        PropublicaDetailRoot memberDetailsRoot;

        legID = propublicaAPI.getLegID();

        memberDetailsRoot = clientDetail.getSenatorDetail(legID);
        return memberDetailsRoot;

    }

    public String findSenatorFullName(PropublicaDetailRoot senatorDetails) {
        ArrayList<PropublicaDetailResult> results;
        String fullName = "";
        results = senatorDetails.getResults();
        for(PropublicaDetailResult item: results) {
            String firstName = item.getFirst_name();
            String lastName = item.getLast_name();
            fullName = firstName + " " + lastName;
        }
        return fullName;
    }


    public ArrayList<String> findSenatorRoles(PropublicaDetailRoot senatorDetails) {
        ArrayList<PropublicaDetailResult> results;
        ArrayList<PropublicaDetailRole> roles;
        ArrayList<String> senatorRoles = new ArrayList<>();

        results = senatorDetails.getResults();
        for (PropublicaDetailResult result : results) {
            String firstName = result.getFirst_name();
            String lastName = result.getLast_name();
            roles = result.getRoles();
            for (PropublicaDetailRole role : roles) {
                String roleTitle = role.getTitle();
                String startDate = role.getStart_date();
                senatorRoles.add("firstName: " + firstName + " " + "LastName: " + lastName + " " + "RoleTitle: " + roleTitle + " " + "StartDate: " + startDate);
            }
        }

        return senatorRoles;
    }


    public ArrayList<String> findSenatorCommittees(PropublicaDetailRoot senatorDetails) {
        ArrayList<PropublicaDetailResult> results;
        ArrayList<PropublicaDetailRole> roles;
        ArrayList<PropublicaDetailCommittee> committees;
        ArrayList<String> senatorRoles = new ArrayList<>();

        results = senatorDetails.getResults();
        for (PropublicaDetailResult result : results) {
            String firstName = result.getFirst_name();
            String lastName = result.getLast_name();
            roles = result.getRoles();
            for (PropublicaDetailRole role : roles) {
                committees = role.getCommittees();
                for (PropublicaDetailCommittee item : committees) {
                    String committeeName = item.getName();
                    String committeeTitle = item.getTitle();
                    String committeeCode = item.getCode();
                    String committeeRank = item.getRank_in_party();
                    String committeeSide = item.getSide();
                    senatorRoles.add("FirstName: " + firstName + " " + "LastName: " + lastName + " "
                            + "CommitteeName: " + committeeName + " " + "CommitteeTitle: " + " " + committeeTitle + " "
                            + "CommitteeCode: " + committeeCode + " " + "CommitteeRank: " + " " + committeeRank + " "
                            + "CommitteeSide: " + committeeSide + " ");
                }
            }
        }

        return senatorRoles;
    }

}
