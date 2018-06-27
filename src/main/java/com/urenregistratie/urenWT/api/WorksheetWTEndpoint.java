package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.WorksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("worksheet")
@Component
public class WorksheetWTEndpoint {
    @Autowired
    WorksheetService worksheetWTService;

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response showAll() {
//        Iterable<Worksheet> worksheets = worksheetWTService.giveAll();
//        return Response.ok(worksheets).build();
//    }
}
