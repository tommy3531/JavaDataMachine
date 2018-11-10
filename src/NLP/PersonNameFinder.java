//package NLP;
//
//import opennlp.tools.namefind.NameFinderME;
//import opennlp.tools.namefind.TokenNameFinderModel;
//import opennlp.tools.util.Span;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//
//public class PersonNameFinder {
//
//    public StringBuilder getNameFromBill(String[] billTokens){
//        StringBuilder person = new StringBuilder();
//        try {
//            InputStream modelIn = new FileInputStream("/Users/tommarler/Downloads/en-ner-person.bin");
//            TokenNameFinderModel tokenModel = new TokenNameFinderModel(modelIn);
//            NameFinderME nameFinderME = new NameFinderME(tokenModel);
//
//            Span nameSpans[] = nameFinderME.find(billTokens);
//
//            for(Span s: nameSpans){
//                for(int index=s.getStart(); index<s.getEnd(); index++){
//                    person.append(billTokens[index]+", ");
//                }
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return person;
//
//    }
//}
