package io.dropwizard.archetypes.resources;

import io.dropwizard.archetypes.db.MySQL;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/spz")
    public class Post
    {

        @POST
        @Path("/reservation")
        @Produces(MediaType.APPLICATION_JSON)
        public String checkCredentials(Reservation credential){

            MySQL mySQL = new MySQL();

            mySQL.insertNewReservationIntoDb(credential);

            return "{}";

        }
    }