package com.example.country.soap;


import com.example.country.repository.CountryRepository;
import org.oorsprong.ListOfCountryNamesByName;
import org.oorsprong.ListOfCountryNamesByNameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigInteger;

@Service
@Component("NumberConversion")
public class SoapClient extends WebServiceGatewaySupport {

    @Autowired
    private CountryRepository countryRepository;

    private String endpoint = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?wsdl";

/*
    public String getCapital(String country) {
        CapitalCity request = new CapitalCity();
        System.out.println("request "+request);
        request.setSCountryISOCode(String.valueOf(country));
        System.out.println(request.getSCountryISOCode());

        CapitalCityResponse response = (CapitalCityResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
                request);
        System.out.println("response "+response);
        System.out.println(response.getCapitalCityResult());
        return response.getCapitalCityResult();
    }
*/

    public ListOfCountryNamesByNameResponse getContry() {
        countryRepository.deleteAll();

        ListOfCountryNamesByName request = new ListOfCountryNamesByName();
        System.out.println("request "+request);

        ListOfCountryNamesByNameResponse response = (ListOfCountryNamesByNameResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint,
                request);
        System.out.println("response "+response);
        System.out.println("response "+response.getListOfCountryNamesByNameResult().getCountryCodeAndName().size());
        System.out.println("response "+response.getListOfCountryNamesByNameResult().getCountryCodeAndName().get(0).getSName());
        System.out.println("response "+response.getListOfCountryNamesByNameResult().getCountryCodeAndName().get(0).getSISOCode());

        /*
        Country country1 = new Country();
        country1.setName("Russia");
        country1.setIsocode("RUS");
        countryRepository.save(country1);
         */

        return response;
    }

}

