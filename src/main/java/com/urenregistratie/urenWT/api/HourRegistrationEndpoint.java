package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.HourRegistrationService;
import com.urenregistratie.urenWT.domain.HourRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("user/candidate/{id}/hour_registration")
@Component
public class HourRegistrationEndpoint {
    @Autowired
    HourRegistrationService hourRegistrationWTService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<HourRegistration> hourRegistrations = this.hourRegistrationWTService.giveAll();
        return Response.ok(hourRegistrations).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHourRegistrationById(@PathParam("id") Long id){
        if(this.hourRegistrationWTService.existsById(id)) {
            HourRegistration hourRegistration = this.hourRegistrationWTService.findById(id);
            return Response.ok(hourRegistration).build();
        }
        System.out.println("HourRegistration id in GET not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postHourRegistration(HourRegistration hourRegistration){
        if(hourRegistration != null){
            HourRegistration result = this.hourRegistrationWTService.save(hourRegistration);
            return Response.accepted(result.getHourRegistrationID()).build();
        }
        System.out.println("HourRegistration in POST is null!");
        return Response.status(Status.INTERNAL_SERVER_ERROR).build();
    }

    //    @PUT
    @POST
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateHourRegistration(@PathParam("id") Long id, HourRegistration hourRegistrationEdit){
        if(this.hourRegistrationWTService.existsById(id)) {
            HourRegistration canEdit = this.hourRegistrationWTService.findById(id);

            HourRegistration result = this.hourRegistrationWTService.save(canEdit);
            return Response.accepted(result.getHourRegistrationID()).build();
        }
        System.out.println("HourRegistration id in PUT not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteHourRegistration(@QueryParam("id") Long id) {
        if(this.hourRegistrationWTService.existsById(id)) {
            this.hourRegistrationWTService.deleteById(id);
            System.out.println("Deleted HourRegistration account with id: " + id);
            return Response.noContent().build();
        }
        System.out.println("HourRegistration id in DELETE not found!");
        return Response.status(Status.NOT_FOUND).build();
    }
}