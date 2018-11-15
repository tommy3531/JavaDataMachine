import Client.MapLightClient;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import Worker.PropublicaWorkerDetail;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws Exception {

        PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
        PropublicaDetailRoot propublicaDetailRoot = propublicaWorkerDetail.getSenatorRoles();
        ArrayList<String> committees = propublicaWorkerDetail.findSenatorCommittees(propublicaDetailRoot);
        System.out.println(committees);

        MapLightClient mapLightClient = new MapLightClient();
        mapLightClient.getMapLight();



    }
}