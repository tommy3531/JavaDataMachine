//package Service;
//
//
//
//import DataModel.Propublica.PropublicaRoot;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.util.EntityUtils;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class PropublicaService {
//
//
//    public PropublicaService(){
//
//    }
//
//    public PropublicaRoot getAllSenatorRootNode(HttpGet request){
//
//        PropublicaRoot listMemberRoot = new PropublicaRoot();
//
//        try {
//
//            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//            HttpClient client = new DefaultHttpClient();
//            HttpResponse response = client.execute(request);
//            HttpEntity entity = response.getEntity();
//            if(entity != null) {
//                String result = EntityUtils.toString(entity);
//                listMemberRoot  = objectMapper.readValue(result, PropublicaRoot.class);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return listMemberRoot;
//
//    }
//}
