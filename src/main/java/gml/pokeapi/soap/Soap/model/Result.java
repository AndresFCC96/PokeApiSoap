package gml.pokeapi.soap.Soap.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "result", namespace = "http://gmlpt.com/pokemon")
public class Result {

    private String name;
    private String url;

    @XmlElement(namespace = "http://gmlpt.com/pokemon")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(namespace = "http://gmlpt.com/pokemon")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}