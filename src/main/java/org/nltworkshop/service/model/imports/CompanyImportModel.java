package org.nltworkshop.service.model.imports;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.*;

@JacksonXmlRootElement(localName = "company")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CompanyImportModel {

    @XmlAttribute
    private String name;

    public CompanyImportModel() {
    }

    public CompanyImportModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
