package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.CandidateService;
import com.urenregistratie.urenWT.controller.HourRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("user/candidate")
@Component
public class HourRegistrationEndpoint {
    @Autowired
    HourRegistrationService hourRegistrationService;
    @Autowired
    CandidateService candidateWTService;

//    @GET
//    @Path("{id}/hour_registration")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response showAllCandidateHourRegistration(@PathParam("id") Long id) {
//        if(this.candidateWTService.existsById(id)) {
//            Candidate candidate = this.candidateWTService.findById(id);
//            candidate.getHourRegistrations();
//            Iterable<HourRegistration> hourRegistrations = candidate.getHourRegistrations();
//            return Response.ok(hourRegistrations).build();
//        }
//        System.out.println("Candidate id in GET not found!");
//        return Response.status(Status.NOT_FOUND).build();
//    }
}
