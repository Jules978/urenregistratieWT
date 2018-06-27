package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.EmployeeClientService;
import com.urenregistratie.urenWT.domain.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user/employee_client")
@Component
public class EmployeeClientEndpoint {
    @Autowired
    EmployeeClientService employeeClientService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<EmployeeClient> employeeClients = employeeClientService.giveAll();
        return Response.ok(employeeClients).build();
    }
}
