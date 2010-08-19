package de.akquinet.hibersap.demo.dao;

import de.akquinet.hibersap.demo.model.Flight;
import de.akquinet.hibersap.demo.model.FlightInfo;
import de.akquinet.hibersap.demo.model.FlightSearchFields;
import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.SessionManager;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import static junit.framework.Assert.assertEquals;

/**
 * @author <a href="mailto:michael.schuetz@akquinet.de">Michael Schuetz</a>, akquinet tech@spree GmbH
 */
public class SapFlightDaoTest {

    private static final Logger LOG = java.util.logging.Logger.getLogger(SapFlightDaoTest.class.getName());

    private SapFlightDao dao;

    @Before
    public void setup() throws IOException {

        final AnnotationConfiguration config = new AnnotationConfiguration("A12");
        config.getSessionManagerConfig().addAnnotatedClass(FlightInfo.class);
        dao = new SapFlightDao(config.buildSessionManager());
    }


    @Test
    public void testGetCustomerData() throws Exception {
        final SessionManager sessionManager = new AnnotationConfiguration().buildSessionManager();
       LOG.info("SMConfig: " + sessionManager.getConfig());

        final FlightSearchFields searchFields = new FlightSearchFields("*");

        final List<Flight> list = dao.findFlightInfo(searchFields).getFlights();

        assertEquals("The flight application in SAP doesn't seem to be initialized. Run program SAPBC_BOR_SFLIGHT in transaction SE38", 1, list.size());
    }
}
