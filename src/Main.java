import Client.PropublicaClient;
import DataModel.Propublica.Member;
import DataModel.Propublica.PropublicaRoot;
import Manager.PropublicaManager;
import Worker.PropublicaWorker;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        PropublicaRoot propublicaRoot;

        PropublicaWorker propublicaWorker = new PropublicaWorker();
        propublicaRoot = propublicaWorker.getSenatorRoot();
        System.out.println("From worker: " + propublicaRoot.getStatus());


    }
}