package com.example.country.controllers;

import com.example.country.soap.SoapClient;
import org.oorsprong.ListOfCountryNamesByNameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@EnableScheduling
@RestController
@RequestMapping("/country")
public class SoapClientController {
    @Autowired
    private SoapClient soapClient;

    @GetMapping("/")
    @Scheduled(fixedRate = 1800000)
    public ListOfCountryNamesByNameResponse getListCapital() {
        System.out.println(new Date());
        return soapClient.getContry();
    }


}

