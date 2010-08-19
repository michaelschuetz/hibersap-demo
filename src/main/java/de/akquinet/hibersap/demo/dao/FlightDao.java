package de.akquinet.hibersap.demo.dao;

import de.akquinet.hibersap.demo.model.FlightInfo;
import de.akquinet.hibersap.demo.model.FlightSearchFields;

/**
 * @author <a href="mailto:michael.schuetz@akquinet.de">Michael Schuetz</a>, akquinet tech@spree GmbH
 */
public interface FlightDao {
    /**
     * Gets information on customers according to the given search fields.
     *
     * @param fields The search fields.
     * @return A CustomerInfo object.
     */
    FlightInfo findFlightInfo(FlightSearchFields fields);
}
