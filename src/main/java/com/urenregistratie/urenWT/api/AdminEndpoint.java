package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.AdminService;
import com.urenregistratie.urenWT.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("user/admin")
@Component
public class AdminEndpoint {
    @Autowired
    AdminService adminService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<Admin> admins = adminService.giveAll();
        return Response.ok(admins).build();
    }
}
