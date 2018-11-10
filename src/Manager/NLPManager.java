//package Manager;
//
//
//import com.company.NLP.PartOfSpeechFinder;
//import com.company.NLP.PersonNameFinder;
//import com.company.NLP.SentenceFinder;
//import com.company.NLP.TokenizeBill;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class NLPManager {
//
//    TokenizeBill tokenizeBill;
//    SentenceFinder sentenceFinder;
//    PartOfSpeechFinder partOfSpeechFinder;
//    PersonNameFinder personNameFinder;
//
//    ArrayList<String> posNNP = new ArrayList<String>();
//    ArrayList<String> posNN = new ArrayList<String>();
//    ArrayList<String> posDT = new ArrayList<String>();
//    ArrayList<String> posVB = new ArrayList<String>();
//    ArrayList<String> posVbd = new ArrayList<String>();
//    ArrayList<String> posVbz = new ArrayList<String>();
//    ArrayList<String> posIN = new ArrayList<String>();
//    ArrayList<String> posTo = new ArrayList<String>();
//    ArrayList<String> posJJ = new ArrayList<String>();
//    ArrayList<String> posNNPS = new ArrayList<String>();
//    ArrayList<String> posNNS = new ArrayList<String>();
//
//    ArrayList<String> posCD = new ArrayList<String>();
//    ArrayList<String> posVBP = new ArrayList<String>();
//    ArrayList<String> posVBG = new ArrayList<String>();
//    ArrayList<String> posPRP = new ArrayList<String>();
//
//    ArrayList<String> posMD = new ArrayList<String>();
//    ArrayList<String> posWRB = new ArrayList<String>();
//    ArrayList<String> posLRB = new ArrayList<String>();
//    ArrayList<String> posRRB = new ArrayList<String>();
//    ArrayList<String> posCC = new ArrayList<String>();
//
//
//    String[] textTokens;
//    ArrayList<String> textPlusTag;
//    ArrayList<String> sentences;
//    ArrayList<String> urlText;
//    ArrayList<String> billData;
//
//    public NLPManager() {
//
//        tokenizeBill = new TokenizeBill();
//        sentenceFinder = new SentenceFinder();
//        partOfSpeechFinder = new PartOfSpeechFinder();
//        personNameFinder = new PersonNameFinder();
//    }
//
//
////    public ArrayList<String> getSentence(ArrayList<String> billTextData) throws Exception {
////
////        sentences = sentenceFinder.getSentenceFromBill(billTextData);
////        return sentences;
////    }
//
////    public String[] getBillTextToken(ArrayList<String> billTextData) {
////
////        textTokens = tokenizeBill.tokenizeBillText(billTextData);
////
////
////        return textTokens;
////    }
//
//    public HashMap<String, ArrayList<String>> getBillPOS(String[] billToeknData) {
//        textPlusTag = partOfSpeechFinder.getPOSFromBill(billToeknData);
//
//
//        HashMap<String, ArrayList<String>> tagCollection = new HashMap<String, ArrayList<String>>();
//
//        for (String obj : textPlusTag) {
//
//            if (obj.contains("CD")) {
//                posCD.add(obj);
//            }
//
//            if (obj.contains("JJ")) {
//                posJJ.add(obj);
//            }
//
//            if (obj.contains("NN")) {
//                posNN.add(obj);
//            }
//
//            if (obj.contains("DT")) {
//                posDT.add(obj);
//            }
//
//            if (obj.contains("VB")) {
//                posVB.add(obj);
//            }
//
//            if (obj.contains("VBD")) {
//                posVbd.add(obj);
//            }
//
//            if (obj.contains("VBZ")) {
//                posVbz.add(obj);
//            }
//
//            if (obj.contains("NN")) {
//                posNN.add(obj);
//            }
//
//            if (obj.contains("NNP")) {
//                posNNP.add(obj);
//            }
//
//            if (obj.contains("NNS")) {
//                posNNS.add(obj);
//            }
//
//            if (obj.contains("NNPS")) {
//                posNNPS.add(obj);
//            }
//
//            if (obj.contains("TO")) {
//                posTo.add(obj);
//            }
//
//            if (obj.contains("VBP")) {
//                posVBP.add(obj);
//            }
//            if (obj.contains("VBG")) {
//                posVBG.add(obj);
//            }
//
//            if (obj.contains("PRP")) {
//                posPRP.add(obj);
//            }
//
//            if (obj.contains("IN")) {
//                posIN.add(obj);
//            }
//
//            if (obj.contains("MD")) {
//                posMD.add(obj);
//            }
//
//            if (obj.contains("WRB")) {
//                posWRB.add(obj);
//            }
//
//            if (obj.contains("LRB")) {
//                posLRB.add(obj);
//            }
//
//            if (obj.contains("RRB")) {
//                posRRB.add(obj);
//            }
//
//            if (obj.contains("CC")) {
//                posCC.add(obj);
//            }
//
//            if (obj.contains("PRP")) {
//                posPRP.add(obj);
//            }
//
//        }
//
//        tagCollection.put("CC: ", posCC);
//        tagCollection.put("CD: ", posCD);
//        tagCollection.put("DT: ", posDT);
//        tagCollection.put("IN: ", posNN);
//        tagCollection.put("JJ: ", posJJ);
//        tagCollection.put("LRB: ", posLRB);
//        tagCollection.put("MD: ", posMD);
//        tagCollection.put("NN: ", posNN);
//        tagCollection.put("NNP: ", posNNP);
//        tagCollection.put("NNS: ", posNNS);
//        tagCollection.put("NNPS: ", posNNPS);
//        tagCollection.put("PRP: ", posPRP);
//        tagCollection.put("TO: ", posTo);
//        tagCollection.put("VBP: ", posVBP);
//        tagCollection.put("VB: ", posVB);
//        tagCollection.put("VBG: ", posVBG);
//        tagCollection.put("VBD: ", posVbd);
//        tagCollection.put("VBZ: ", posVbz);
//        tagCollection.put("WRB: ", posWRB);
//
//        return tagCollection;
//    }
//}
//
////      TODO: Not Printing all Person Entitys
////      TODO: Need to work on printing on Person from BillText
////        person = personNameFinder.getNameFromBill(textTokens);
////        System.out.println("\nDisplay GetNameFromBill\n");
////        data.put("PersonName", person);
//
//
