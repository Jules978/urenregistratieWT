package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("user")
@Component
public class UserEndpoint {
    @Autowired
    UserService userService;
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response showAll() {
//        Iterable<User> users = userService.giveAll();
//        return Response.ok(users).build();
//    }
}
