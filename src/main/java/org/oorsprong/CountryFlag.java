package org.oorsprong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "sCountryISOCode"
})
@XmlRootElement(name = "CountryFlag")
public class CountryFlag {
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
