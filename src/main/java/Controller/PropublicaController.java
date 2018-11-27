package Controller;

import DataModel.Propublica.Member;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import TypeCreater.SenatorBasicInformation;
import TypeCreater.SenatorBill;
import TypeCreater.SenatorCommittees;
import TypeCreater.SenatorFullName;
import Worker.PropublicaBillWorker;
import Worker.PropublicaWorker;
import Worker.PropublicaWorkerDetail;
import com.politicalAPI.Main;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PropublicaController extends Main {

    PropublicaWorker propublicaWorker = new PropublicaWorker();
    PropublicaWorkerDetail propublicaWorkerDetail = new PropublicaWorkerDetail();
    ArrayList<SenatorCommittees> committees;
    PropublicaBillWorker propublicaBillWorker = new PropublicaBillWorker();

    @RequestMapping("/propublica/getSenator")
    public ArrayList<Member> allSenators() {
        ArrayList<Member> members = propublicaWorker.getMembers();
        return members;
    }

    @RequestMapping("/propublica/getSenatorFirstName")
    public ArrayList<SenatorFullName> senatorFullNames() {
        ArrayList<SenatorFullName> senatorFullNames = propublicaWorker.getSenatorFullName();
        return senatorFullNames;
    }

    @RequestMapping("/propublica/getSenatorBasic")
    public ArrayList<SenatorBasicInformation> senatorBasic() {
        ArrayList<SenatorBasicInformation> senatorBasicInformations = propublicaWorker.getSenatorBasicInformation();
        return senatorBasicInformations;
    }

    @RequestMapping("/propublica/getAllSenatorRoles/{legID}")
    public PropublicaDetailRoot senatorRoles(@PathVariable String legID){
        PropublicaDetailRoot root = propublicaWorkerDetail.getAllSenatorRoles(legID);
        return root;
    }

    @RequestMapping("/propublica/getSenatorBills/{legID}")
    public ArrayList<SenatorBill> senatorBills(@PathVariable String legID) throws ParseException {
        ArrayList<SenatorBill> bills = propublicaBillWorker.getSenatorBills(legID);
        return bills;
    }

    @RequestMapping("propublica/getSenatorRoles")
    public ArrayList<String> findSenatorRoles() {
        ArrayList<String> roles = propublicaWorkerDetail.getSenatorRoles();
        return roles;
    }

    @RequestMapping("propublica/getSenatorCommittees")
    public ArrayList<SenatorCommittees> senatorCommittees() {
        committees = propublicaWorkerDetail.findSenatorCommittees();
        return committees;
    }
}
