package Controller;

import DataModel.Propublica.Member;
import TypeCreater.SenatorBasicInformation;
import TypeCreater.SenatorFullName;
import Worker.PropublicaWorker;
import com.politicalAPI.Main;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PropublicaController extends Main {

    PropublicaWorker propublicaWorker = new PropublicaWorker();

    @RequestMapping("/getSenator")
    public ArrayList<Member> allSenators() {
        ArrayList<Member> members = propublicaWorker.getMembers();
        return members;
    }

    @RequestMapping("/getSenatorFirstName")
    public ArrayList<SenatorFullName> senatorFullNames() {
        ArrayList<SenatorFullName> senatorFullNames = propublicaWorker.getSenatorFullName();
        return senatorFullNames;
    }

    @RequestMapping("/getSenatorBasic")
    public ArrayList<SenatorBasicInformation> senatorBasic() {
        ArrayList<SenatorBasicInformation> senatorBasicInformations = propublicaWorker.getSenatorBasicInformation();
        return senatorBasicInformations;
    }
}
