package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("month")
@Component
public class MonthEndpoint {
    @Autowired
    MonthService monthService;
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response showAll() {
//        Iterable<Month> months = monthService.giveAll();
//        return Response.ok(months).build();
//    }
}
