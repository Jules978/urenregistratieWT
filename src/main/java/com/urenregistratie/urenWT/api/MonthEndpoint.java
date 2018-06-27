package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.MonthService;
import com.urenregistratie.urenWT.domain.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("month")
@Component
public class MonthEndpoint {
    @Autowired
    MonthService monthService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<Month> months = monthService.giveAll();
        return Response.ok(months).build();
    }
}