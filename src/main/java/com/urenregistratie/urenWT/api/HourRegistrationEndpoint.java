package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.CandidateService;
import com.urenregistratie.urenWT.controller.HourRegistrationService;
import com.urenregistratie.urenWT.domain.HourRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.ArrayList;

@Path("user/candidate/{id}/hour_registration")
@Component
public class HourRegistrationEndpoint {
    @Autowired
    HourRegistrationService hourRegistrationService;
    @Autowired
    CandidateService candidateService;

    @GET //show all hour regs of candidate
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAllCandidateHourRegistration(@PathParam("id") Long id) {
        if(this.candidateService.existsById(id)) {
//            Long candidateID = this.candidateService.findById(id).getUserID();
//            Iterable<HourRegistration> hourRegistrationsIterable = this.hourRegistrationService.giveAll();
//            ArrayList<HourRegistration> hourRegistrations = new ArrayList();
//
//            for(HourRegistration hourRegistration : hourRegistrationsIterable){
//                if(hourRegistration.getCandidate().getUserID() == candidateID){
//                    hourRegistrations.add(hourRegistration);
//                }
//            }
        	ArrayList<HourRegistration> hourRegistrations = this.hourRegistrationService.getAllCandidateHourRegs(id);
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
        return Response.status(Status.NOT_FOUND).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postHourRegistration(HourRegistration hourRegistration, @PathParam("id") Long id) {
        if (hourRegistration != null) {
            if (this.candidateService.existsById(hourRegistration.getCandidate().getUserID())) {
                HourRegistration result = this.hourRegistrationService.save(hourRegistration);
                return Response.accepted(result.getHourRegistrationID()).build();
            }
            System.out.println("Candidate id not found in POST hour registration!");
            return Response.status(Status.NOT_FOUND).build();
        }
        System.out.println("HourRegistration in POST is null!");
        return Response.status(Status.INTERNAL_SERVER_ERROR).build();
    }

    //    @PUT
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

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteHourRegistration(@QueryParam("id") Long id) {
        if(this.hourRegistrationService.existsById(id)) {
            this.hourRegistrationService.deleteById(id);
            System.out.println("Deleted HourRegistration account with id: " + id);
            return Response.noContent().build();
        }
        System.out.println("HourRegistration id in DELETE not found!");
        return Response.status(Status.NOT_FOUND).build();
    }
}