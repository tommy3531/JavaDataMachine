//package Store;
//
//import com.company.DataModel.Propublica.Senator.*;
//import com.company.Manager.PropublicaManager;
//import java.util.ArrayList;
//
//public class PropublicaStore {
//
//    public PropublicaManager propublicaManager;
//
//
//    public PropublicaStore() {
//
//        propublicaManager = new PropublicaManager();
//    }
//
//    public ArrayList<SenatorFirstName> listOfSenatorsByFirstName() {
//        ArrayList<SenatorFirstName> firstNameOfSenators = propublicaManager.getFirstNameOfAllSenators();
//        for (SenatorFirstName firstName : firstNameOfSenators) {
//            System.out.println(firstName.getFirstName());
//        }
//
//        return firstNameOfSenators;
//    }
//
//    public ArrayList<SenatorLastName> listOfSenatorsByLastName() {
//        ArrayList<SenatorLastName> lastNameOfAllSenators = propublicaManager.getLastNameOfAllsenators();
//        for (SenatorLastName lastName : lastNameOfAllSenators) {
//            System.out.println(lastName.getLastName());
//        }
//        return lastNameOfAllSenators;
//    }
//
//    public ArrayList<SenatorFullName> listOfSenatorsByFullName() {
//        ArrayList<SenatorFullName> fullNameOfAllSenators = propublicaManager.getFullNameOfAllSenators();
//        for (SenatorFullName fullName : fullNameOfAllSenators) {
//            System.out.println(fullName.getFirstName() + " " + fullName.getLastName());
//        }
//        return fullNameOfAllSenators;
//    }
//
//    public ArrayList<SenatorIds> listOfSenatorsById() {
//        ArrayList<SenatorIds> idOfAllSenators = propublicaManager.getIDsOfAllSenators();
//        for (SenatorIds id : idOfAllSenators) {
//            System.out.println(id.getFirstName() + " " + id.getLastName() + "\n" +
//                               id.getLegID() + "\n" +
//                               id.getCrpID() + "\n" +
//                               id.getLisID() + "\n" +
//                               id.getCspandID() + "\n" +
//                               id.getFecID() + "\n" +
//                               id.getGovTrackID() + "\n" +
//                               id.getIcprsID() + "\n" +
//                               id.getLisID() + "\n" +
//                               id.getOcdID() + "\n" +
//                               id.getVoteSmartID() + "\n");
//        }
//        return idOfAllSenators;
//    }
//
//    public ArrayList<SenatorLegIds> listOfSenatorsLegId() {
//        ArrayList<SenatorLegIds> senatorLegIds = propublicaManager.getSenatorLegId();
//        for (SenatorLegIds id : senatorLegIds) {
//            System.out.println(id.getFirstName() + " " + id.getLastName() + "\n" +
//                               id.getLegId() + "\n");
//        }
//        return senatorLegIds;
//    }
//
//    public ArrayList<SenatorSocialAccount> listOfSenatorsSocialId() {
//        ArrayList<SenatorSocialAccount> socialAccountsOfAllSenators = propublicaManager.getSocialAccountsOfAllSenators();
//        for (SenatorSocialAccount account : socialAccountsOfAllSenators) {
//            System.out.println(account.getFirstName() + " " + account.getLastName() + "\n" +
//                               account.getFacebook() + "\n" +
//                               account.getTwitter() + "\n" +
//                               account.getGoogle() + "\n" +
//                               account.getYoutube() + "\n");
//        }
//        return socialAccountsOfAllSenators;
//    }
//
//    public ArrayList<SenatorBasicInformation> listOfSenatorsBasicInformation() {
//        ArrayList<SenatorBasicInformation> basicInformation = propublicaManager.getBasicInformationOfAllSenators();
//        for (SenatorBasicInformation basic : basicInformation) {
//            System.out.println(basic.getFirstName() + " " + basic.getLastName() + "\n" +
//                               basic.getTitle() + "\n" +
//                               basic.getParty() + "\n" +
//                               basic.getBday() + "\n" +
//                               basic.getOffice() + "\n" +
//                               basic.getPhone() + "\n");
//        }
//
//        return basicInformation;
//    }
//
//}
