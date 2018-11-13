import DataModel.Propublica.Member;
import Manager.PropublicaManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        PropublicaManager propublicaManager = new PropublicaManager();

        ArrayList<Member> members = propublicaManager.getMembers();
//        List<String> firstName = propublicaManager.getMemberFirstName(members);
        List<String> lastName = propublicaManager.getMemberLastName(members);
//        System.out.println(firstName);
        List<String> fullName = propublicaManager.getMemberFullName(members);
        List<String> social = propublicaManager.getMemberBasicInformation(members);
        System.out.println(social);


    }
}