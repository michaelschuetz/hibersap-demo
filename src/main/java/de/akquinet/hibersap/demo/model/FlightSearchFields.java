package de.akquinet.hibersap.demo.model;

import java.io.Serializable;

/**
 * @author <a href="mailto:michael.schuetz@akquinet.de">Michael Schuetz</a>, akquinet tech@spree GmbH
 */
public class FlightSearchFields implements Serializable {
    private String fromCity;

    public FlightSearchFields(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }
}