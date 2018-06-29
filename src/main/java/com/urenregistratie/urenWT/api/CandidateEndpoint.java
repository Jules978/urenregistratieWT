package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.CandidateService;
import com.urenregistratie.urenWT.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/user/candidate")
@Component
public class CandidateEndpoint {
    @Autowired
    CandidateService candidateWTService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<Candidate> candidate = this.candidateWTService.giveAll();
        return Response.ok(candidate).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCandidateById(@PathParam("id") Long id){
        if(this.candidateWTService.existsById(id)) {
            Candidate candidate = this.candidateWTService.findById(id);
            return Response.ok(candidate).build();
        }
        System.out.println("Candidate id in GET not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postCandidate(Candidate candidate){
        if(candidate != null){
            Candidate result = this.candidateWTService.save(candidate);
            return Response.accepted(result.getUserID()).build();
        }
        System.out.println("Candidate in POST is null!");
        return Response.status(Status.INTERNAL_SERVER_ERROR).build();
    }

//    @PUT
    @POST
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCandidate(@PathParam("id") Long id, Candidate candidateEdit){
        if(this.candidateWTService.existsById(id)) {
            Candidate canEdit = this.candidateWTService.findById(id);

            canEdit.setFirstName(candidateEdit.getFirstName());
            canEdit.setLastName(candidateEdit.getLastName());
            canEdit.setDateOfBirth(candidateEdit.getDateOfBirth());
            canEdit.setEmailAddress(candidateEdit.getEmailAddress());
            canEdit.setTelephoneNumber(candidateEdit.getTelephoneNumber());
            canEdit.setPermissionLevel(candidateEdit.getPermissionLevel());
            canEdit.setPassword(candidateEdit.getPassword());

            Candidate result = this.candidateWTService.save(canEdit);
            return Response.accepted(result.getUserID()).build();
        }
        System.out.println("Candidate id in PUT not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteCandidate(@QueryParam("id") Long id) {
        if(this.candidateWTService.existsById(id)) {
            this.candidateWTService.deleteById(id);
            System.out.println("Deleted Candidate account with id: " + id);
            return Response.noContent().build();
        }
        System.out.println("Candidate id in DELETE not found!");
        return Response.status(Status.NOT_FOUND).build();
    }
}
