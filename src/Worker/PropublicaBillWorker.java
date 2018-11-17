package Worker;

import Client.PropublicaBillClient;
import DataModel.PropublicaBill.PropublicaBillRoot;

public class PropublicaBillWorker {

    PropublicaBillClient propublicaBillClient = new PropublicaBillClient();
    PropublicaBillRoot propublicaBillRoot;

    public PropublicaBillWorker() {

    }

    public void getSenatorBills(String id) {

        propublicaBillRoot = propublicaBillClient.getSenatorBills(id);
        System.out.println(propublicaBillRoot.getStatus());
    }


}
