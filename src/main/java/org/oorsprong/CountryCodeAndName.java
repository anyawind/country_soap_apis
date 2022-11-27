package org.oorsprong;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "sISOCode",
        "sName"
})
@XmlRootElement(name = "tCountryCodeAndName")
public class CountryCodeAndName {
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String sISOCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String sName;

    public String getSISOCode() {
        return sISOCode;
    }
    public void setSISOCode(String value) {
        this.sISOCode = value;
    }

    public String getSName() {
        return sName;
    }
    public void setSName(String value) {
        this.sName = value;
    }
}

