package de.akquinet.hibersap.demo.dao;

import de.akquinet.hibersap.demo.dao.FlightDao;
import de.akquinet.hibersap.demo.model.FlightInfo;
import de.akquinet.hibersap.demo.model.FlightSearchFields;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

import java.util.logging.Logger;

/**
 * Provides access to flight customers in SAP.
 *
 * @author <a href="mailto:michael.schuetz@akquinet.de">Michael Schuetz</a>, akquinet tech@spree GmbH
 */
public class SapFlightDao implements FlightDao {
    private static final Logger LOG = Logger.getLogger(SapFlightDao.class.getName());

    // The Hibersap session manager
    private final SessionManager sessionManager;

    /**
     * @param sessionManager The Hibersap session manager
     */
    public SapFlightDao(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    /**
     * {@inheritDoc}
     */
    public FlightInfo findFlightInfo(FlightSearchFields fields) {
        LOG.info("Looking for flights data in SAP...");
        FlightInfo bapi = new FlightInfo(fields.getFromCountryKey(), fields.getFromCity(), fields.getToCountryKey(), fields.getToCity());
        final Session session = sessionManager.openSession();
        try {
            session.execute(bapi);
            LOG.info(String.format("%d flight(s) read from SAP", bapi.getFlights().size()));
        }
        finally {
            session.close();
        }

        return bapi;
    }
}
