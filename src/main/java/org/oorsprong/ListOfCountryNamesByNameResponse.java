package org.oorsprong;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ListOfCountryNamesByNameResult"
})
@XmlRootElement(name = "ListOfCountryNamesByNameResponse")
public class ListOfCountryNamesByNameResponse {

    @XmlElement(name = "ListOfCountryNamesByNameResult", required = true)
    private ListOfCountryNamesByNameResult ListOfCountryNamesByNameResult;

    public ListOfCountryNamesByNameResult getListOfCountryNamesByNameResult() {
        return ListOfCountryNamesByNameResult;
    }

    public void setListOfCountryNamesByNameResult(ListOfCountryNamesByNameResult listOfCountryNamesByNameResult) {
        ListOfCountryNamesByNameResult = listOfCountryNamesByNameResult;
    }

}


