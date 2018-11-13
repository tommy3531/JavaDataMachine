package Worker;

import Client.PropublicaClient;
import DataModel.Propublica.Member;
import DataModel.Propublica.PropublicaRoot;

import java.util.ArrayList;


public class PropublicaWorker {

    public PropublicaClient client;
    public PropublicaRoot senatorRoot;


    public PropublicaWorker() {

        client = new PropublicaClient();
        senatorRoot = client.getSenators();
    }

    public PropublicaRoot getSenatorRoot() {
        return senatorRoot;
    }

    public ArrayList<String> getSenatorFirstName(ArrayList<Member> members) {

        ArrayList<String> firstName = new ArrayList<>();
        for (Member senator : members) {
            String firstNameString = senator.getFirst_name();
            senator.setFirst_name(firstNameString);
            firstName.add(firstNameString);
        }

        return firstName;
    }
}
//
//    public ArrayList<SenatorLastName> findLastNameOfAllSenators(ArrayList<PropublicaSenator> senators) {
//        ArrayList<SenatorLastName> senatorLastNames = new ArrayList<SenatorLastName>();
//
//        for(PropublicaSenator senator: senators){
//            String lastName = senator.getLastName();
//            SenatorLastName senatorLastName = new SenatorLastName(lastName);
//            senatorLastNames.add(senatorLastName);
//        }
//
//        return senatorLastNames;
//    }
//
//    public ArrayList<SenatorFullName> findFullNameOfAllSenators(ArrayList<PropublicaSenator> senators) {
//        ArrayList<SenatorFullName> senatorFullNames = new ArrayList<SenatorFullName>();
//
//        for(PropublicaSenator senator: senators){
//            String firstName = senator.getFirstName();
//            String lastName = senator.getLastName();
//
//            SenatorFullName fullName = new SenatorFullName(firstName, lastName);
//            senatorFullNames.add(fullName);
//        }
//
//        return senatorFullNames;
//    }
//
//    public ArrayList<SenatorIds> findAllSenatorIds(ArrayList<PropublicaSenator> senators) {
//        ArrayList<SenatorIds> senatorIDS = new ArrayList<SenatorIds>();
//
//        for(PropublicaSenator senator: senators){
//
//            String firstName = senator.getFirstName();
//            String lastName = senator.getLastName();
//            String legID = senator.getId();
//            String crpID = senator.getCrpId();
//            String cSpanID = senator.getCspanId();
//            String fecID = senator.getFecCandidateId();
//            String govTrackID = senator.getGovtrackId();
//            String icpsrID = senator.getIcpsrId();
//            String lisID = senator.getLisId();
//            String ocdID = senator.getOcdId();
//            String voteSmartID = senator.getVotesmartId();
//
//            SenatorIds senatorIds = new SenatorIds(firstName, lastName, legID, crpID, cSpanID, fecID, govTrackID, icpsrID, lisID, ocdID, voteSmartID);
//            senatorIDS.add(senatorIds);
//        }
//
//        return senatorIDS;
//    }
//
//    public ArrayList<SenatorLegIds> findAllSenatorLegIds(ArrayList<PropublicaSenator> senators){
//        ArrayList<SenatorLegIds> legIDS = new ArrayList<SenatorLegIds>();
//
//        for(PropublicaSenator senator: senators){
//            String firstName = senator.getFirstName();
//            String lastName = senator.getLastName();
//            String legId = senator.getId();
//            SenatorLegIds senatorLegIds = new SenatorLegIds(firstName, lastName, legId);
//            legIDS.add(senatorLegIds);
//        }
//
//        return legIDS;
//    }
//
//    public ArrayList<SenatorSocialAccount> findAllSenatorSocialAccount(ArrayList<PropublicaSenator> senators) {
//        ArrayList<SenatorSocialAccount> socialAccount = new ArrayList<SenatorSocialAccount>();
//
//        for(PropublicaSenator senator: senators){
//            String firstName = senator.getFirstName();
//            String lastName = senator.getLastName();
//            String facebook = senator.getFacebookAccount();
//            String google = senator.getGoogleEntityId();
//            String twitter = senator.getTwitterAccount();
//            String youtube = senator.getYoutubeAccount();
//
//            SenatorSocialAccount senatorSocialAccount = new SenatorSocialAccount(firstName, lastName, facebook, google, twitter, youtube);
//            socialAccount.add(senatorSocialAccount);
//
//        }
//
//        return socialAccount;
//    }
//
//    public ArrayList<SenatorBasicInformation> findAllSenatorBasicInformation(ArrayList<PropublicaSenator> senators) {
//        ArrayList<SenatorBasicInformation> basicInformation = new ArrayList<SenatorBasicInformation>();
//
//        for(PropublicaSenator senator: senators){
//            String firstName = senator.getFirstName();
//            String lastName = senator.getLastName();
//            String title = senator.getTitle();
//            String party = senator.getParty();
//            String bday = senator.getDateOfBirth();
//            String office = senator.getOffice();
//            String phone = senator.getPhone();
//
//            SenatorBasicInformation senatorBasicInformation = new SenatorBasicInformation(firstName, lastName, title, party, bday, office, phone);
//            basicInformation.add(senatorBasicInformation);
//
//        }
//
//        return basicInformation;
//    }
//}
//
//    private TokenizeBill tokenizeBill;
////    private PropublicaRepository propublicaRepository;
//
//    public PropublicaWorker() {
//
////        propublicaRepository = new PropublicaRepository();
//
//    }
//
//    public void displayAllSenator() {
//
//        ArrayList<PropublicaSenatorResult> propublicaSenatorResult;
//        propublicaSenatorResult = propublicaRepository.getAllSenators();
//        System.out.println("Showing all Senators");
//        ArrayList<PropublicaSenator> propublicaSenators;
//
//        for (PropublicaSenatorResult item : propublicaSenatorResult) {
//            System.out.println(item.getChamber());
//            System.out.println(item.getCongress());
//            System.out.println(item.getNumResults());
//            propublicaSenators = item.getMembers();
//
//            for (PropublicaSenator memberItem : propublicaSenators) {
//                System.out.println("**************           SenatorDetail ID                   *********************\n");
//                System.out.println("Leg ID: " + memberItem.getId());
//                System.out.println("Open Secrets ID: " + memberItem.getCrpId());
//                System.out.println("C-Span ID: " + memberItem.getCspanId());
//                System.out.println("Open Civic ID: " + memberItem.getOcdId());
//                System.out.println("Congress ID: " + memberItem.getLisId());
//                System.out.println("GovTrackID: " + memberItem.getGovtrackId());
//                System.out.println("FEC ID: " + memberItem.getFecCandidateId());
//                System.out.println("\n**************         SenatorDetail ID END                ****************\n");
//                System.out.println("\n**************         SenatorDetail Full Name             ****************\n");
//                System.out.println("First Name: " + memberItem.getFirstName());
//                System.out.println("Middle Name: " + memberItem.getMiddleName());
//                System.out.println("Last Name: " + memberItem.getLastName());
//                System.out.println("\n**************         SenatorDetail Full Name END         ****************\n");
//                System.out.println("\n**************         SenatorDetail Social Account        ****************\n");
//                System.out.println("Facebook: " + memberItem.getFacebookAccount());
//                System.out.println("Google: " + memberItem.getGoogleEntityId());
//                System.out.println("Youtube: " + memberItem.getYoutubeAccount());
//                System.out.println("\n**************         SenatorDetail Social Account End    ****************\n");
//                System.out.println("\n**************         SenatorDetail Basic Information     ****************\n");
//                System.out.println("URL: " + memberItem.getUrl());
//                System.out.println("LeaderShip Role: " + memberItem.getLeadershipRole());
//                System.out.println("Next Election: " + memberItem.getNextElection());
//                System.out.println("\n**************         SenatorDetail Basic Information END ****************\n");
//
//            }
//        }
//
//    }
//
//
//    public void displaySenatorDetail() {
//
//        ArrayList<PropublicaMemberResults> memberResults;
//        ArrayList<PropublicaMemberRole> memberRoles;
//        ArrayList<PropublicaMemberCommittee> memberCommittees;
//        ArrayList<PropublicaMemberSubComittee> memberSubComittees;
//
//        memberResults = propublicaRepository.getSenatorDetail();
//        for(PropublicaMemberResults resultsItem : memberResults) {
//            System.out.println("\n**************     SenatorDetail Roles, Committee and Subcommittee ****************\n");
//            System.out.println(resultsItem.getFirstName());
//            System.out.println(resultsItem.getMemberId());
//            memberRoles = resultsItem.getRoles();
//            for(PropublicaMemberRole roleItem: memberRoles) {
//                System.out.println("\n**************                SenatorDetail Roles              ****************\n");
//                System.out.println("                                 Title: " + roleItem.getTitle());
//                System.out.println("                                 Congress: " + roleItem.getCongress());
//                System.out.println("                                 District: " + roleItem.getDistrict());
//                System.out.println("                                 Chamber: " + roleItem.getChamber());
//                System.out.println("                                 Party: " + roleItem.getParty());
//                System.out.println("                                 State: " + roleItem.getState());
//                System.out.println("                                 Co-Sponsored: " + roleItem.getBillsCosponsored());
//                System.out.println("                                 Bills Sponsored: " + roleItem.getBillsSponsored());
//                System.out.println("                                 Missed Votes: " + roleItem.getMissedVotesPct());
//                memberCommittees = roleItem.getCommittees();
//                memberSubComittees = roleItem.getSubcommittees();
//                for(PropublicaMemberCommittee committeeItem: memberCommittees) {
//                    System.out.println("\n**************            SenatorDetail Committees         ****************\n");
//                    System.out.println("                             Committee Name: " + committeeItem.getName());
//                    System.out.println("                             Committee Title: " + committeeItem.getTitle());
//                }
//                for(PropublicaMemberSubComittee subComitteeItem: memberSubComittees) {
//                    System.out.println("\n**************            SenatorDetail Subcommittees      ****************\n");
//                    System.out.println("                             Sub-Committee Name: " + subComitteeItem.getName());
//                    System.out.println("                             Sub-Committee: " + subComitteeItem.getSide());
//                }
//            }
//        }
//    }
//
//    public ArrayList<String> getBillURL() {
//        ArrayList<String> govTrackURL = new ArrayList<String>();
//        ArrayList<PropublicaBillResult> propublicaBillResults;
//        ArrayList<PropublicaMemberBills> propublicaMemberBills;
//
//
//        propublicaBillResults = propublicaRepository.getSenatorBill();
//        for(PropublicaBillResult resultItem: propublicaBillResults) {
//            propublicaMemberBills = resultItem.getBills();
//            for(PropublicaMemberBills billItem: propublicaMemberBills) {
//                govTrackURL.add(billItem.getGovtrackUrl());
//            }
//        }
//
//        return govTrackURL;
//    }
//
//
//    public ArrayList<String> getBillTextURL() {
//
//        ArrayList<String> govTrack = new ArrayList<String>();
//        ArrayList<PropublicaBillResult> propublicaBillResults;
//        ArrayList<PropublicaMemberBills> propublicaMemberBills;
//
//        propublicaBillResults = propublicaRepository.getSenatorBill();
//        for(PropublicaBillResult resultItem: propublicaBillResults){
//            propublicaMemberBills = resultItem.getBills();
//            for(PropublicaMemberBills billItem: propublicaMemberBills) {
//                govTrack.add(billItem.getGovtrackUrl() + "/text");
//            }
//        }
//
//        return govTrack;
//    }
//
//    public ArrayList<String> getBillTextFromHTML(ArrayList<String> urls) {
//
//        ArrayList<String> govTrackBillText = new ArrayList<String>();
//
//        try {
//
//            for (String urlObj : urls) {
//                Document doc = Jsoup.connect(urlObj.toString()).get();
//                String source = doc.text();
//                govTrackBillText.add(source);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return govTrackBillText;
//    }
//
//}