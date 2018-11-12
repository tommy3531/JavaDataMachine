import DataModel.Propublica.Member;
import Manager.PropublicaManager;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        PropublicaManager propublicaManager = new PropublicaManager();

        ArrayList<Member> members = propublicaManager.getMembers();
        List<String> firstName = propublicaManager.getMemberFirstName();
        System.out.println((firstName));


    }
}