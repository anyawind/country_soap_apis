package org.oorsprong;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "tCountryCodeAndName"
})
@XmlRootElement(name = "ListOfCountryNamesByNameResult")
public class ListOfCountryNamesByNameResult {
    @XmlElement(name = "tCountryCodeAndName", nillable = true)
    protected List<CountryCodeAndName> tCountryCodeAndName;

    public List<CountryCodeAndName> getCountryCodeAndName() {
        if (tCountryCodeAndName == null) {
            tCountryCodeAndName = new ArrayList<CountryCodeAndName>();
        }
        return this.tCountryCodeAndName;
    }

}
