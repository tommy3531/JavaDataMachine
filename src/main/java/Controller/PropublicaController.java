package Controller;

import DataModel.Propublica.Member;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import TypeCreater.SenatorBasicInformation;
import TypeCreater.SenatorCommittees;
import TypeCreater.SenatorFullName;
import Worker.PropublicaWorker;
import Worker.PropublicaWorkerDetail;
import com.politicalAPI.Main;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PropublicaController extends Main {

    PropublicaWorker propublicaWorker = new PropublicaWorker();
    PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
    ArrayList<SenatorCommittees> committees;

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

    @RequestMapping("/getSenatorRoles/{legID}")
    public PropublicaDetailRoot senatorRoles(@PathVariable String legID){
        PropublicaDetailRoot root = propublicaWorkerDetail.getSenatorRoles(legID);
        return root;

    }

    @RequestMapping("/getSenatorCommittees")
    public ArrayList<SenatorCommittees> senatorCommittees() {
        committees = propublicaWorkerDetail.findSenatorCommittees();
        return committees;
    }
}
