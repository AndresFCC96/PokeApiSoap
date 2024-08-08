package gml.pokeapi.soap.Soap.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetPokemonsRequest", namespace = "http://gmlpt.com/pokemon")
public class GetPokemonsRequest {

    private int limit;
    private int offset;

    @XmlElement(name = "limit", namespace = "http://gmlpt.com/pokemon")
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @XmlElement(name = "offset", namespace = "http://gmlpt.com/pokemon")
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
