package io.dropwizard.archetypes.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Reservation {

    @JsonProperty("licence")
    public String licence;

    @JsonProperty("street")
    public String street;

    @JsonProperty("reservation_date")
    public String reservation_date;


    public String getLicence() {
        return licence;
    }

    public String getStreet() {
        return street;
    }

    public String getDate() {
        return reservation_date;
    }



}
