//package NLP;
//
//import opennlp.tools.sentdetect.SentenceDetectorME;
//import opennlp.tools.sentdetect.SentenceModel;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.util.ArrayList;
//
//public class SentenceFinder {
//
//    public String[] sentences;
//    public ArrayList<String> sentenceText;
//
//    public String[] newsSetences;
//    public ArrayList<String> newsSentenceText;
//
//    public SentenceFinder() {
//
//        sentenceText = new ArrayList<String>();
//        newsSentenceText = new ArrayList<String>();
//    }
//
//    public ArrayList<String> getSentenceFromBill(ArrayList<String> billText) throws Exception{
//
//        InputStream modelIn = new FileInputStream("/Users/tommarler/Downloads/en-sent.bin");
//        SentenceModel model = new SentenceModel(modelIn);
//        SentenceDetectorME sentenceDetector = new SentenceDetectorME(model);
//        for(String textObject: billText) {
//            sentences = sentenceDetector.sentDetect(textObject);
//            for(String obj: sentences){
//                sentenceText.add(obj.toString());
//            }
//        }
//        return sentenceText;
//    }
//
//    public ArrayList<String> getSentenceFromArticle(ArrayList<String> billText) throws Exception{
//
//        InputStream modelIn = new FileInputStream("/Users/tommarler/Downloads/en-sent.bin");
//        SentenceModel model = new SentenceModel(modelIn);
//        SentenceDetectorME sentenceDetector = new SentenceDetectorME(model);
//        for(String textObject: billText) {
//            newsSetences = sentenceDetector.sentDetect(textObject);
//            for(String obj: newsSetences){
//                newsSentenceText.add(obj.toString());
//            }
//        }
//        return newsSentenceText;
//    }
//}
