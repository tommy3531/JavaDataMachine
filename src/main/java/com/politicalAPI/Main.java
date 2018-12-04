package com.politicalAPI;

import API.PropublicaAPI;
import Client.LegiScanClient;
import Client.NewsClient;
import Client.PropublicaStateClient;
import Controller.PropublicaController;
import DataModel.Fec.FecRoot;
import DataModel.Propublica.Member;
import DataModel.PropublicaDetail.PropublicaDetailRoot;
import TypeCreater.*;
import Worker.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@RestController
@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {

//        PropublicaAPI propublicaAPI = new PropublicaAPI();

//        // Specific Senator
//        String legId = propublicaAPI.getLegID();
//

//
//        // Specific Senator full Name
//        String fullname = propublicaWorkerDetail.findSenatorFullName(propublicaDetailRoot);
//
//
//        // Maplight
//        MaplightWorker maplightWorker = new MaplightWorker();
//        ArrayList<SenatorFinance> senatorFinances = maplightWorker.extractDataFromMapLight(fecIdString);
//        for(SenatorFinance root: senatorFinances){
//            System.out.println(root.getDonorName());
//        }
//
//
//        NewsClient newsClient = new NewsClient();
//        newsClient.getNewsAPITopHeadLine();
//
//        // List of senators by state
//        String state = "mo";
//        PropublicaStateClient propublicaStateClient = new PropublicaStateClient();
//        String stateInfo = propublicaStateClient.getSenatorsByState(state);
//
//        LegiScanClient legiScanClient = new LegiScanClient();
//        String legiScanJson = legiScanClient.getBillsByState(state);
//        System.out.println(legiScanJson);
        SpringApplication.run(PropublicaController.class, args);


    }
}