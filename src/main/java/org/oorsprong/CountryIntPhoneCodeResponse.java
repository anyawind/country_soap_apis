package org.oorsprong;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "CountryIntPhoneCodeResult"
})
@XmlRootElement(name = "CountryIntPhoneCodeResponse")
public class CountryIntPhoneCodeResponse {

    @XmlElement(name = "CountryIntPhoneCodeResult", required = true)
    public String CountryIntPhoneCodeResult;

    public String getCountryIntPhoneCodeResult() {
        return CountryIntPhoneCodeResult;
    }

    public void setCountryIntPhoneCodeResult(String value) {
        this.CountryIntPhoneCodeResult = value;
    }

}
