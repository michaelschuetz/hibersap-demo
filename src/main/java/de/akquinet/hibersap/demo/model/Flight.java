package de.akquinet.hibersap.demo.model;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Convert;
import org.hibersap.annotations.Parameter;

/**
 * @author <a href="mailto:michael.schuetz@akquinet.de">Michael Schuetz</a>, akquinet tech@spree GmbH
 */
@BapiStructure
public class Flight {
    @Parameter("CARRID")
    private String carrId;

    @Parameter("AIRPFROM")
    private String airpFrom;

    @Parameter("AIRPTO")
    private String airpTo;

    @Parameter("SEATSMAX")
    private Integer seatsMax;

    @Parameter("SEATSOCC")
    private Integer seatsOcc;

    public String getCarrId() {
        return carrId;
    }

    public void setCarrId(String carrId) {
        this.carrId = carrId;
    }

    public String getAirpFrom() {
        return airpFrom;
    }

    public void setAirpFrom(String airpFrom) {
        this.airpFrom = airpFrom;
    }

    public String getAirpTo() {
        return airpTo;
    }

    public void setAirpTo(String airpTo) {
        this.airpTo = airpTo;
    }

    public Integer getSeatsMax() {
        return seatsMax;
    }

    public void setSeatsMax(Integer seatsMax) {
        this.seatsMax = seatsMax;
    }

    public Integer getSeatsOcc() {
        return seatsOcc;
    }

    public void setSeatsOcc(Integer seatsOcc) {
        this.seatsOcc = seatsOcc;
    }
}
