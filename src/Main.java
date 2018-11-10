import Client.PropublicaClient;
import DataModel.Propublica.PropublicaRoot;



public class Main {

    public static void main(String[] args) throws Exception {

        // PropublicaStore propublicaStore = new PropublicaStore();
        PropublicaRoot propublica = new PropublicaRoot();
        PropublicaClient propublicaClient = new PropublicaClient();
        propublica = propublicaClient.getListOfSenatorsRequest();
        System.out.println(propublica.getStatus());
        

//        propublicaStore.listOfSenatorsByFirstName();
//        propublicaStore.listOfSenatorsByLastName();
//        propublicaStore.listOfSenatorsByFullName();
//        propublicaStore.listOfSenatorsLegId();
//        propublicaStore.listOfSenatorsById();
//        propublicaStore.listOfSenatorsSocialId();
//        propublicaStore.listOfSenatorsBasicInformation();
//
        // PropublicaStoreDetail propublicaStoreDetail = new PropublicaStoreDetail();
//        propublicaStoreDetail.listSenatorRolesAndCommittees();
        // propublicaStoreDetail.listSenatorRoles();



    }
}


//        ArrayList<String> billURL = propublicaStore.getBillURL();
//        ArrayList<String> billTextURL = propublicaStore.getBillTextURL();
//
//        ArrayList<String> billData = propublicaStore.getBillTextData();
//
//        SentenceFinder sentenceFinder = new SentenceFinder();
//        TokenizeBill tokenizeBill = new TokenizeBill();
//        PartOfSpeechFinder partOfSpeechFinder = new PartOfSpeechFinder();
//
//        ArrayList<String> billSentences = sentenceFinder.getSentenceFromBill(billData);
//        System.out.println("\nPrinting out Bill Sentences \n");
//        for (String obj : billSentences) {
//            System.out.println(obj);
//        }
//
//        String[] tokenBill = tokenizeBill.tokenizeBillText(billData);
//        ArrayList<String> posBill = partOfSpeechFinder.getPOSFromBill(tokenBill);
//        System.out.println("\nPrinting out Bill Tokens \n");
//        for (String obj : posBill) {
//            System.out.println(obj);
//        }
//
//        ArrayList<String> article = newsStore.getArticles();
//
//        System.out.println("\nPrinting out Article \n");
//        for(String item: article){
//            System.out.println(item);
//        }
//
//        String[] tokenArticle = tokenizeBill.tokenizeArticle(article);
//        ArrayList<String> posNews = partOfSpeechFinder.getPOSFromArticle(tokenArticle);
//        System.out.println("\nPrinting out Article Token \n");
//        for (String obj : posNews) {
//            System.out.println(obj);
//        }




