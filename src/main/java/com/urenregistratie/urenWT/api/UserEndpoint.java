package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.UserService;
import com.urenregistratie.urenWT.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("user")
@Component
public class UserEndpoint {
    @Autowired
    UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response toonAllen() {
        Iterable<User> users = userService.geefAllen();
        return Response.ok(users).build();
    }
}
