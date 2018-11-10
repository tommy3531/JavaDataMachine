//package Store;
//
//import com.company.Manager.NLPManager;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//public class NLPStore {
//
//    ArrayList<String> sentences;
//    HashMap<String, ArrayList<String>> tagCollection;
//
//
//    String[] sentence;
//    NLPManager nlpManager;
//
//    public NLPStore() {
//
//        nlpManager = new NLPManager();
//        tagCollection = new HashMap<String, ArrayList<String>>();
//    }
//
////    public ArrayList<String> getBillSentences(ArrayList<String> billTextData) throws Exception {
////
////        sentences = nlpManager.getSentence(billTextData);
////        return sentences;
////    }
//
//    public String[] getSentenceToken(ArrayList<String> billSentenceData){
////        sentence = nlpManager.getBillTextToken(billSentenceData);
//        return sentence;
//    }
//
//    public HashMap<String, ArrayList<String>> getBillPOS(String[] billSentenceTokenData) {
//        tagCollection = nlpManager.getBillPOS(billSentenceTokenData);
//        return tagCollection;
//    }
//
//    public void displayBillPOS(HashMap<String, ArrayList<String>> billPOSDatsa){
//        for (Map.Entry<String, ArrayList<String>> hashMapElement : billPOSDatsa.entrySet()) {
//            for (Object obj : hashMapElement.getValue()) {
//                System.out.println(obj);
//            }
//        }
//
//    }
//
//
//
//}
