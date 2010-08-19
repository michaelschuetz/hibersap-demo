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
    @Parameter("FROMCITY")
    private String fromCity;

    @Table
    @Parameter("FLIGHTLIST")
    private List<Flight> flights = new ArrayList<Flight>();

    public FlightInfo(String fromCity) {
        this.fromCity = fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
