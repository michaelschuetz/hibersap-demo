package de.akquinet.hibersap.demo.model;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Convert;
import org.hibersap.annotations.Parameter;

/**
 * @author <a href="mailto:michael.schuetz@akquinet.de">Michael Schuetz</a>, akquinet tech@spree GmbH
 */
@BapiStructure
public class Flight {
    @Parameter("CITYFROM")
    private String cityFrom;

    @Parameter("CITYTO")
    private String cityTo;

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

}
