package io.dropwizard.archetypes.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.dropwizard.archetypes.db.MySQL;


public class Insert {



    @POST
    @Path("/registration")
    @Produces(MediaType.APPLICATION_JSON)
    public void createNewUser(Registration registration) {
        MySQL mySQL=new MySQL();

            mySQL.insertNewReservationIntoDb(registration);

    }

}
