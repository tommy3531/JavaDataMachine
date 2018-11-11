import Client.PropublicaClient;
import DataModel.Propublica.Member;
import DataModel.Propublica.PropublicaRoot;
import DataModel.Propublica.Result;
import Manager.PropublicaManager;
import Worker.PropublicaWorker;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        PropublicaRoot propublicaRoot;
        PropublicaWorker propublicaWorker = new PropublicaWorker();
        ArrayList<Member> members = new ArrayList<>();
        ArrayList<Result> results;
        ArrayList<String> firstNames;

        propublicaRoot = propublicaWorker.getSenatorRoot();
        results = propublicaRoot.getResults();

        for(Result item: results) {
            members = item.getMembers();

        }

        firstNames = propublicaWorker.getSenatorFirstName(members);
        System.out.println("Worker Printing out FirstName: " + firstNames);
    }
}