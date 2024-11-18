package org.nltworkshop.service.model.imports;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@JacksonXmlRootElement(localName = "companies")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CompanyRootImportModel {

    @JacksonXmlProperty(localName = "company")
    private Set<CompanyImportModel> companyImportModels;

    public CompanyRootImportModel() {
    }

    public CompanyRootImportModel(Set<CompanyImportModel> companyImportModels) {
        this.companyImportModels = companyImportModels;
    }

    public Set<CompanyImportModel> getCompanyImportModels() {
        return companyImportModels;
    }

    public void setCompanyImportModels(Set<CompanyImportModel> companyImportModels) {
        this.companyImportModels = companyImportModels;
    }
}
