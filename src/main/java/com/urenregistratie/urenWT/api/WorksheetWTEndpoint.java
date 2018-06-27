package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.WorksheetService;
import com.urenregistratie.urenWT.domain.Worksheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("worksheet")
@Component
public class WorksheetWTEndpoint {
    @Autowired
    WorksheetService worksheetWTService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<Worksheet> worksheets = worksheetWTService.giveAll();
        return Response.ok(worksheets).build();
    }
}
