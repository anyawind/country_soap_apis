package org.oorsprong;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {}
    public ListOfCountryNamesByName createListOfCountryNamesByName() {
        return new ListOfCountryNamesByName();
    }
    public ListOfCountryNamesByNameResponse createListOfCountryNamesByNameResponse() {
        return new ListOfCountryNamesByNameResponse();
    }

    public CapitalCity createCapitalCity() {return new CapitalCity();}
    public CapitalCityResponse createCapitalCityResponse() {return new CapitalCityResponse();}

    public CountryCurrency createCountryCurrency() {return new CountryCurrency();}
    public CountryCurrencyResponse createCountryCurrencyResponse() {return new CountryCurrencyResponse();}

    public CountryFlag createCountryFlag() {return new CountryFlag();}
    public CountryFlagResponse createCountryFlagResponse() {return new CountryFlagResponse();}

    public CountryIntPhoneCode createCountryIntPhoneCode() {return new CountryIntPhoneCode();}
    public CountryIntPhoneCodeResponse createCountryIntPhoneCodeResponse() {return new CountryIntPhoneCodeResponse();}
}

