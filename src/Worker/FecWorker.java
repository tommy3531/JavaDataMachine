package Worker;

import Client.FecClient;
import DataModel.Fec.FecResult;
import DataModel.Fec.FecRoot;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class FecWorker {

    public FecClient fecClient;

    public FecWorker() {

        fecClient = new FecClient();

    }

    public FecRoot getSenatorRoles(String fullname) throws UnsupportedEncodingException, MalformedURLException {
        FecRoot fecRoot;

        fecRoot = fecClient.findFecId(fullname);
        return fecRoot;

    }

    public ArrayList<String> getFecID(FecRoot fecRoot) {

        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<FecResult> results = fecRoot.getResults();
        for (FecResult senator : results) {
            String firstNameString = senator.getName();
            String idString = senator.getId();

            firstName.add("Firstname: " + firstNameString + " " + "FecID: " + idString);
        }

        return firstName;
    }
}
