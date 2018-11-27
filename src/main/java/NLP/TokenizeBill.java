//package NLP;
//
//import opennlp.tools.tokenize.Tokenizer;
//import opennlp.tools.tokenize.TokenizerME;
//import opennlp.tools.tokenize.TokenizerModel;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.util.ArrayList;
//
//public class TokenizeBill {
//
//    public TokenizeBill() {
//
//    }
//
//    public String[] tokenizeBillText(ArrayList<String> billText) {
//        String[] textTokens = new String[0];
//        try {
//            InputStream modelIn = new FileInputStream("/Users/tommarler/Downloads/en-token.bin");
//            TokenizerModel model = new TokenizerModel(modelIn);
//            Tokenizer tokenizer = new TokenizerME(model);
//            for(String textObj: billText) {
//                String stringTokens[] = tokenizer.tokenize(textObj);
//                textTokens = stringTokens;
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return textTokens;
//    }
//
//    // TODO: Does not work for article returns last article
//    public String[] tokenizeArticle(ArrayList<String> articleText) {
//        String[] articleTokens = new String[0];
//        try {
//            InputStream modelIn = new FileInputStream("/Users/tommarler/Downloads/en-token.bin");
//            TokenizerModel model = new TokenizerModel(modelIn);
//            Tokenizer tokenizer = new TokenizerME(model);
//            for(String textObj: articleText) {
//                articleTokens = tokenizer.tokenize(textObj);
//
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return articleTokens;
//    }
//}
