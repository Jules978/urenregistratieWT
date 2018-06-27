package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.EmployeeWTService;
import com.urenregistratie.urenWT.domain.EmployeeWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user/employee_wt")
@Component
public class EmployeeWTEndpoint {
    @Autowired
    EmployeeWTService employeeWTService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<EmployeeWT> employeeWTs = employeeWTService.giveAll();
        return Response.ok(employeeWTs).build();
    }
}
