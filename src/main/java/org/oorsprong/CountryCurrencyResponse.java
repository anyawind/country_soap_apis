package org.oorsprong;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "CountryCurrencyResult"
})
@XmlRootElement(name = "CountryCurrencyResponse")
public class CountryCurrencyResponse {

    @XmlElement(name = "CountryCurrencyResult", required = true)
    private CountryCurrencyResult CountryCurrencyResult;

    public CountryCurrencyResult getCountryCurrencyResult() {
        return CountryCurrencyResult;
    }

    public void setCountryCurrencyResult(CountryCurrencyResult countryCurrencyResult) {
        CountryCurrencyResult = countryCurrencyResult;
    }

}



