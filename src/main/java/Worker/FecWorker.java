package Worker;

import Client.FecClient;
import DataModel.Fec.FecResult;
import DataModel.Fec.FecRoot;
import TypeCreater.SenatorFec;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class FecWorker {

    public FecClient fecClient;
    FecRoot fecRoot;


    public FecWorker() {

        fecClient = new FecClient();

    }

    public FecRoot getSenatorRoles(String fullname) throws UnsupportedEncodingException, MalformedURLException {

        fecRoot = fecClient.findFecId(fullname);
        return fecRoot;

    }

    public ArrayList<SenatorFec> getFecID(FecRoot fecRoot) {

        SenatorFec senatorFec;

        ArrayList<SenatorFec> senatorFecs = new ArrayList<>();
        ArrayList<FecResult> results = fecRoot.getResults();
        for (FecResult senator : results) {
            String firstNameString = senator.getName();
            String idString = senator.getId();
            senatorFec = new SenatorFec(firstNameString, idString);
            senatorFecs.add(senatorFec);
        }

        return senatorFecs;
    }
}
