package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.HourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("hour")
@Component
public class HourEndpoint {
    @Autowired
    HourService hourService;
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response showAll() {
//        Iterable<Hour> hours = hourService.giveAll();
//        return Response.ok(hours).build();
//    }
}
