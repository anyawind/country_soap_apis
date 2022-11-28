package org.oorsprong;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "capitalCityResult"
})
@XmlRootElement(name = "CapitalCityResponse")
@XmlSeeAlso({CapitalCity.class})
public class CapitalCityResponse {

    @XmlElement(name = "CapitalCityResult", required = true)
    public String capitalCityResult;

    public String getCapitalCityResult() {
        return capitalCityResult;
    }

    public void setCapitalCityResult(String value) {
        this.capitalCityResult = value;
    }

}
