package com.urenregistratie.urenWT.api;

<<<<<<< HEAD
=======
import com.urenregistratie.urenWT.controller.CandidateService;
>>>>>>> master
import com.urenregistratie.urenWT.controller.HourRegistrationService;
import com.urenregistratie.urenWT.domain.HourRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> master

@Path("user/candidate/{id}/hour_registration")
@Component
public class HourRegistrationEndpoint {
    @Autowired
<<<<<<< HEAD
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
=======
    HourRegistrationService hourRegistrationService;
    @Autowired
    CandidateService candidateService;

    @GET //show all hour regs of candidate
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAllCandidateHourRegistration(@PathParam("id") Long id) {
        if(this.candidateService.existsById(id)) {
            Long candidateID = this.candidateService.findById(id).getUserID();
            Iterable<HourRegistration> hourRegistrationsIterable = this.hourRegistrationService.giveAll();
            ArrayList<HourRegistration> hourRegistrations = new ArrayList();

            for(HourRegistration hourRegistration : hourRegistrationsIterable){
                if(hourRegistration.getCandidate().getUserID() == candidateID){
                    hourRegistrations.add(hourRegistration);
                }
            }
            return Response.ok(hourRegistrations).build();
        }
        System.out.println("Candidate id in GET hour registrations not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response showAll() {
//        Iterable<HourRegistration> hourRegistrations = this.hourRegistrationService.giveAll();
//        return Response.ok(hourRegistrations).build();
//    }

    @GET //show specific hour reg of candidate
    @Path("{id_hr}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response showCandidateHourRegistration(@PathParam("id") Long id, @PathParam("id_hr") Long id_hr) {
        if(this.candidateService.existsById(id)) {

            Long candidateID = this.candidateService.findById(id).getUserID();

            if (this.hourRegistrationService.existsById(id_hr) &&
                this.hourRegistrationService.findById(id_hr).getCandidate().getUserID() == candidateID) {

                Long hourRegistrationID = this.hourRegistrationService.findById(id_hr).getHourRegistrationID();
                Iterable<HourRegistration> hourRegistrationsIterable = this.hourRegistrationService.giveAll();

                for (HourRegistration hourRegistration : hourRegistrationsIterable) {
                    if (hourRegistration.getCandidate().getUserID() == candidateID &&
                        hourRegistration.getHourRegistrationID() == hourRegistrationID) {

                        return Response.ok(hourRegistration).build();
                    }
                }
            }
            System.out.println("Hour registration id in GET hour registrations not found or is not tied to candidate!");
            return Response.status(Status.NOT_FOUND).build();
        }
        System.out.println("Candidate id in GET hour registrations not found!");
>>>>>>> master
        return Response.status(Status.NOT_FOUND).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
<<<<<<< HEAD
    public Response postHourRegistration(HourRegistration hourRegistration){
        if(hourRegistration != null){
            HourRegistration result = this.hourRegistrationWTService.save(hourRegistration);
            return Response.accepted(result.getHourRegistrationID()).build();
=======
    public Response postHourRegistration(HourRegistration hourRegistration, @PathParam("id") Long id) {
        if (hourRegistration != null) {
            if (this.candidateService.existsById(hourRegistration.getCandidate().getUserID())) {
                HourRegistration result = this.hourRegistrationService.save(hourRegistration);
                return Response.accepted(result.getHourRegistrationID()).build();
            }
            System.out.println("Candidate id not found in POST hour registration!");
            return Response.status(Status.NOT_FOUND).build();
>>>>>>> master
        }
        System.out.println("HourRegistration in POST is null!");
        return Response.status(Status.INTERNAL_SERVER_ERROR).build();
    }

    //    @PUT
<<<<<<< HEAD
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
=======
//    @POST
//    @Path("{id_hr}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response updateHourRegistration(@PathParam("id") Long id, HourRegistration hourRegistrationEdit){
//        if(this.hourRegistrationService.existsById(id)) {
//            HourRegistration canEdit = this.hourRegistrationService.findById(id);
//
//            HourRegistration result = this.hourRegistrationService.save(canEdit);
//            return Response.accepted(result.getHourRegistrationID()).build();
//        }
//        System.out.println("HourRegistration id in PUT not found!");
//        return Response.status(Status.NOT_FOUND).build();
//    }
>>>>>>> master

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteHourRegistration(@QueryParam("id") Long id) {
<<<<<<< HEAD
        if(this.hourRegistrationWTService.existsById(id)) {
            this.hourRegistrationWTService.deleteById(id);
=======
        if(this.hourRegistrationService.existsById(id)) {
            this.hourRegistrationService.deleteById(id);
>>>>>>> master
            System.out.println("Deleted HourRegistration account with id: " + id);
            return Response.noContent().build();
        }
        System.out.println("HourRegistration id in DELETE not found!");
        return Response.status(Status.NOT_FOUND).build();
    }
}