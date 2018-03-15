package io.dropwizard.archetypes.resources;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Registration{
    @JsonProperty("licence")
    public String licence;
    @JsonProperty("street")
    public String street;
    @JsonProperty("date")
    public String date;

}