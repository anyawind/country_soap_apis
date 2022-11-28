package org.oorsprong;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "CountryFlagResult"
})
@XmlRootElement(name = "CountryFlagResponse")
public class CountryFlagResponse {

    @XmlElement(name = "CountryFlagResult", required = true)
    public String CountryFlagResult;

    public String getCountryFlagResult() {
        return CountryFlagResult;
    }

    public void setCountryFlagResult(String value) {
        this.CountryFlagResult = value;
    }

}
