////package Service;
////
////import com.company.DataModel.Propublica.MemberDetail.PropublicaMemberDetail;
////import com.fasterxml.jackson.databind.DeserializationFeature;
////import com.fasterxml.jackson.databind.ObjectMapper;
////import org.apache.http.HttpEntity;
////import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.util.EntityUtils;
//
//import java.io.IOException;
//
//public class PropublicaServiceDetail {
//
//    public PropublicaServiceDetail() {
//
//    }
//
//    public PropublicaMemberDetail getSpecificMemberRootNode(HttpGet request) {
//
//        PropublicaMemberDetail memberDetail = new PropublicaMemberDetail();
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
//                memberDetail  = objectMapper.readValue(result, PropublicaMemberDetail.class);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return memberDetail;
//
//    }
//}
