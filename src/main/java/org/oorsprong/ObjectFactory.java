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
}

