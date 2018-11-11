import Client.PropublicaClient;
import DataModel.Propublica.PropublicaRoot;

public class Main {

    public static void main(String[] args) throws Exception {

        PropublicaRoot propublica;
        PropublicaClient propublicaClient = new PropublicaClient();
        propublica = propublicaClient.getListOfSenatorsRequest();
        System.out.println(propublica.getStatus());

    }
}