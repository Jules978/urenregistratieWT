package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("year")
@Component
public class YearEndpoint {
    @Autowired
    YearService yearService;

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response showAll() {
//        Iterable<Year> years = yearService.giveAll();
//        return Response.ok(years).build();
//    }
}
