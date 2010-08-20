package de.akquinet.hibersap.demo.model;

import de.akquinet.hibersap.demo.model.Flight;
import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.Table;
import org.hibersap.annotations.Import;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:michael.schuetz@akquinet.de">Michael Schuetz</a>, akquinet tech@spree GmbH
 */
@Bapi("BAPI_SFLIGHT_GETLIST")
public class FlightInfo {
    @Import
    @Parameter("FROMCOUNTRYKEY")
    private String fromCountryKey;

    @Import
    @Parameter("FROMCITY")
    private String fromCity;

    @Import
    @Parameter("TOCOUNTRYKEY")
    private String toCountryKey;

    @Import
    @Parameter("TOCITY")
    private String toCity;

    @Table
    @Parameter("FLIGHTLIST")
    private List<Flight> flights = new ArrayList<Flight>();

    public FlightInfo(String fromCountryKey, String fromCity, String toCountryKey, String toCity) {
        this.fromCountryKey = fromCountryKey;
        this.fromCity = fromCity;
        this.toCountryKey = toCountryKey;
        this.toCity = toCity;
    }

    public void setFromCountryKey(String fromCountryKey) {
        this.fromCountryKey = fromCountryKey;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public void setToCountryKey(String toCountryKey) {
        this.toCountryKey = toCountryKey;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
