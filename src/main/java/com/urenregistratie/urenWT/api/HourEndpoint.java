package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.HourService;
import com.urenregistratie.urenWT.domain.Hour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hour")
@Component
public class HourEndpoint {
    @Autowired
    HourService hourService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<Hour> hours = hourService.giveAll();
        return Response.ok(hours).build();
    }
}
