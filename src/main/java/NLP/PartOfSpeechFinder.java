//package NLP;
//
//import opennlp.tools.postag.POSModel;
//import opennlp.tools.postag.POSTaggerME;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.util.ArrayList;
//
//public class PartOfSpeechFinder {
//
//    public ArrayList<String> getPOSFromBill(String[] billTokens) {
//        String[] nameToken;
//        ArrayList<String> nameTokens = new ArrayList<String>();
//
//        try {
//            InputStream modelIn = new FileInputStream("/Users/tommarler/Downloads/en-pos-maxent.bin");
//            POSModel model = new POSModel(modelIn);
//
//            POSTaggerME tagger = new POSTaggerME(model);
//
//            nameToken = tagger.tag(billTokens);
//            for(int i = 0; i < nameToken.length; i++){
//                nameTokens.add(billTokens[i] + " - " + nameToken[i]);
//            }
//
//            return nameTokens;
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return nameTokens;
//
//    }
//
//    public ArrayList<String> getPOSFromArticle(String[] articleTokens) {
//        String[] articeTokenStr;
//        ArrayList<String> articleNameToken = new ArrayList<String>();
//
//        try {
//            InputStream modelIn = new FileInputStream("/Users/tommarler/Downloads/en-pos-maxent.bin");
//            POSModel model = new POSModel(modelIn);
//
//            POSTaggerME tagger = new POSTaggerME(model);
//
//            articeTokenStr = tagger.tag(articleTokens);
//            for(int i = 0; i < articeTokenStr.length; i++){
//                articleNameToken.add(articleTokens[i] + " - " + articeTokenStr[i]);
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return articleNameToken;
//
//    }
//}
