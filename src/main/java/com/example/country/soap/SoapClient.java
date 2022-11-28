package com.example.country.soap;

import com.example.country.entity.Country;
import com.example.country.repository.CountryRepository;
import org.oorsprong.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
@Component("NumberConversion")
public class SoapClient extends WebServiceGatewaySupport {
    @Autowired
    private CountryRepository countryRepository;
    private String endpoint = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?wsdl";
    public String getCapital(String iso) {
        CapitalCity request = new CapitalCity();
        request.setSCountryISOCode(String.valueOf(iso));
        CapitalCityResponse response = (CapitalCityResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response.getCapitalCityResult();
    }
    public CountryCurrencyResult getCurrency(String iso) {
        CountryCurrency request = new CountryCurrency();
        request.setSCountryISOCode(String.valueOf(iso));
        CountryCurrencyResponse response = (CountryCurrencyResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response.getCountryCurrencyResult();
    }
    public String getFlag(String iso) {
        CountryFlag request = new CountryFlag();
        request.setSCountryISOCode(String.valueOf(iso));
        CountryFlagResponse response = (CountryFlagResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response.getCountryFlagResult();
    }

    public String getPhoneCode(String iso) {
        CountryIntPhoneCode request = new CountryIntPhoneCode();
        request.setSCountryISOCode(String.valueOf(iso));
        CountryIntPhoneCodeResponse response = (CountryIntPhoneCodeResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response.getCountryIntPhoneCodeResult();
    }

    public ListOfCountryNamesByNameResponse getContry() {
        countryRepository.deleteAll();

        ListOfCountryNamesByName request = new ListOfCountryNamesByName();
        ListOfCountryNamesByNameResponse response = (ListOfCountryNamesByNameResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);

        for (int i=0; i<response.getListOfCountryNamesByNameResult().getCountryCodeAndName().size(); i++) {
            Country country = new Country();
            country.setName(response.getListOfCountryNamesByNameResult().getCountryCodeAndName().get(i).getSName());
            country.setIsocode(response.getListOfCountryNamesByNameResult().getCountryCodeAndName().get(i).getSISOCode());
            country.setCapitalcity(getCapital(response.getListOfCountryNamesByNameResult().getCountryCodeAndName().get(i).getSISOCode()));

            CountryCurrencyResult curn = new CountryCurrencyResult();
            curn = getCurrency(response.getListOfCountryNamesByNameResult().getCountryCodeAndName().get(i).getSISOCode());

            country.setCurrencyiso(curn.getSISOCode());
            country.setCurrency(curn.getSName());
            country.setFlag(getFlag(response.getListOfCountryNamesByNameResult().getCountryCodeAndName().get(i).getSISOCode()));
            country.setPhonecode(getPhoneCode(response.getListOfCountryNamesByNameResult().getCountryCodeAndName().get(i).getSISOCode()));
            countryRepository.save(country);
        }
        return response;
    }
}

