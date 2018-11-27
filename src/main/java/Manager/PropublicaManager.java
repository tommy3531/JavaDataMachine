//package Manager;
//
//
//import Client.PropublicaClient;
//import DataModel.Propublica.Member;
//import DataModel.Propublica.PropublicaRoot;
//import DataModel.Propublica.Result;
//import Worker.PropublicaWorker;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//public class PropublicaManager {
//
//
//    public PropublicaClient client;
//
//    PropublicaRoot propublicaRoot;
//    PropublicaWorker propublicaWorker = new PropublicaWorker();
//    ArrayList<Result> results;
//    ArrayList<String> firstNames;
//    ArrayList<String> lastNames;
//    ArrayList<String> fullName;
//    ArrayList<String> social;
//
//
//    public PropublicaManager() {
//
//        propublicaRoot = propublicaWorker.getSenatorRoot();
//        results = propublicaRoot.getResults();
//
//    }
//
//    public ArrayList<Member> getMembers() {
//        ArrayList<Member> membersData = new ArrayList<>();
//
//        for(Result item: results) {
//            membersData = item.getMembers();
//
//        }
//
//        return membersData;
//    }
//
//    public List<String> getMemberFirstName(ArrayList<Member> members) {
//
//        return firstNames;
//    }
//
//    public List<String> getMemberLastName(ArrayList<Member> members) {
//        lastNames = propublicaWorker.getSenatorLastName(members);
//        return lastNames;
//    }
//
//    public List<String> getMemberFullName(ArrayList<Member> members) {
//        fullName = propublicaWorker.getSenatorFullName(members);
//        return fullName;
//    }
//
//    public ArrayList<String> getMemberBasicInformation(ArrayList<Member> members) {
//        social = propublicaWorker.getSenatorBasicInformation(members);
//        return social;
//    }
//}
////
////    public PropublicaWorker propublicaWorker;
////    public ArrayList<PropublicaRoot> senators;
////
////    public PropublicaManager() {
////
////        propublicaWorker = new PropublicaWorker();
////        senators = propublicaWorker.getAllSenators();
////
////    }
////
////    public ArrayList<PropublicaRoot> getSenatorObj() {
////        return senators;
////    }
////
////    public ArrayList<SenatorFullName> getFirstNameOfAllSenators(){
////        ArrayList<SenatorFullName> senatorByFirstName = propublicaWorker.findFirstNameOfAllSenators(senators);
////        return senatorByFirstName;
////    }
////
////    public ArrayList<SenatorLastName> getLastNameOfAllsenators() {
////        ArrayList<SenatorLastName> lastNameOfAllSenators = propublicaWorker.findLastNameOfAllSenators(senators);
////        return lastNameOfAllSenators;
////    }
////
////    public ArrayList<SenatorFullName> getFullNameOfAllSenators() {
////        ArrayList<SenatorFullName> fullNameOfAllSenators = propublicaWorker.findFullNameOfAllSenators(senators);
////        return fullNameOfAllSenators;
////    }
////
////    public ArrayList<SenatorIds> getIDsOfAllSenators() {
////        ArrayList<SenatorIds> idOfAllSenators = propublicaWorker.findAllSenatorIds(senators);
////        return idOfAllSenators;
////    }
////
////    public ArrayList<SenatorLegIds> getSenatorLegId() {
////        ArrayList<SenatorLegIds> senatorLegIDs = propublicaWorker.findAllSenatorLegIds(senators);
////        return senatorLegIDs;
////    }
////
////    public ArrayList<SenatorSocialAccount> getSocialAccountsOfAllSenators() {
////        ArrayList<SenatorSocialAccount> socialAccounts = propublicaWorker.findAllSenatorSocialAccount(senators);
////        return socialAccounts;
////    }
////
////    public ArrayList<SenatorBasicInformation> getBasicInformationOfAllSenators() {
////        ArrayList<SenatorBasicInformation> basicInformation = propublicaWorker.findAllSenatorBasicInformation(senators);
////        return basicInformation;
////    }
////
//////
//////    ArrayList<String> billURL;
//////    ArrayList<String> billTextURL;
//////    ArrayList<String> htmlToText;
//////
//////    PropublicaWorker propublicaWorker;
//////
//////
//////    public PropublicaManager() {
//////        propublicaWorker = new PropublicaWorker();
//////
//////    }
//////
//////    public void displayAllSenator() {
//////        propublicaWorker.displayAllSenator();
//////
//////    }
//////
//////    public void displaySenatorDetails() {
//////        propublicaWorker.displaySenatorDetail();
//////    }
//////
//////    public ArrayList<String> getBillURL() {
//////        billURL = propublicaWorker.getBillURL();
//////        return billURL;
//////    }
//////
//////    public ArrayList<String> getBillTextURL() {
//////        billTextURL = propublicaWorker.getBillTextURL();
//////        return billTextURL;
//////    }
//////
//////    public ArrayList<String> getHtmlToText() {
//////        htmlToText = propublicaWorker.getBillTextFromHTML(billTextURL);
//////        return htmlToText;
//////    }
//////
//////    public void displayBillTextURL(ArrayList<String> billTextData) {
//////        for(String obj: billTextData){
//////            System.out.println(obj);
//////        }
//////    }
//////
//////    public void displalyBillIFromHTML(ArrayList<String> textData) {
//////
//////        for(String obj: textData){
//////            System.out.println(obj);
//////        }
//////    }
//////
//////}
