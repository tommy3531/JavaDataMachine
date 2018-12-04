package Controller;

import DataModel.Fec.FecRoot;
import TypeCreater.SenatorFec;
import Worker.FecWorker;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;

@RestController
public class FecController {

    // Specific Senator FecID
    FecWorker fecWorker = new FecWorker();
    String fecIdString = "";
    FecRoot fecRoot;

    @RequestMapping("/fec/fullname/{fullname}")
    public FecRoot fecRoles(@PathVariable String fullname) throws UnsupportedEncodingException, MalformedURLException {
        fecRoot = fecWorker.getSenatorRoles(fullname);
        return fecRoot;
    }

    @RequestMapping("/fec/id/{ID}")
    public ArrayList<SenatorFec> fecId(@PathVariable String ID) {
        ArrayList<SenatorFec> fecID = fecWorker.getFecID(fecRoot);
        fecIdString = fecID.get(0).getFecId();
        return fecID;

    }
}
