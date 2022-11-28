package org.oorsprong;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "sCountryISOCode"
})
@XmlRootElement(name = "CountryIntPhoneCode")
public class CountryIntPhoneCode {
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String sCountryISOCode;

    public String getSCountryISOCode() {
        return sCountryISOCode;
    }
    public void setSCountryISOCode(String value) {
        this.sCountryISOCode = value;
    }
}
