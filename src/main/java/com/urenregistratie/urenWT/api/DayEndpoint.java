package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("day")
@Component
public class DayEndpoint {
    @Autowired
    DayService dayService;
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response showAll() {
//        Iterable<Day> days = dayService.giveAll();
//        return Response.ok(days).build();
//    }
}
