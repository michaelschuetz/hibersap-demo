package de.akquinet.hibersap.demo.model;

import java.io.Serializable;

/**
 * @author <a href="mailto:michael.schuetz@akquinet.de">Michael Schuetz</a>, akquinet tech@spree GmbH
 */
public class FlightSearchFields implements Serializable {
    private String fromCountryKey;
    private String fromCity;
    private String toCountryKey;
    private String toCity;

    public FlightSearchFields(String fromCountryKey, String fromCity, String toCountryKey, String toCity) {
        this.fromCountryKey = fromCountryKey;
        this.fromCity = fromCity;
        this.toCountryKey = toCountryKey;
        this.toCity = toCity;
    }

    public String getFromCountryKey() {
        return fromCountryKey;
    }

    public void setFromCountryKey(String fromCountryKey) {
        this.fromCountryKey = fromCountryKey;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCountryKey() {
        return toCountryKey;
    }

    public void setToCountryKey(String toCountryKey) {
        this.toCountryKey = toCountryKey;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }
}