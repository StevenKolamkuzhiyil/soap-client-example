package org.stko.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.stko.services.ContinentService;

@Path("/continents")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContinentResource {

    @Inject
    ContinentService continentService;

    @GET
    public Response continents() {
        return Response.ok(continentService.getContinentList()).build();
    }
}
