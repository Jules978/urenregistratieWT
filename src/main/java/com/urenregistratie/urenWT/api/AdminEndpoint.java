package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("user/admin")
@Component
public class AdminEndpoint {
    @Autowired
    AdminService adminService;

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response showAll() {
//        Iterable<Admin> admins = adminService.giveAll();
//        return Response.ok(admins).build();
//    }
}
