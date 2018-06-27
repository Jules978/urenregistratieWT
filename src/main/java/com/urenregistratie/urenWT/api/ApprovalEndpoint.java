package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.ApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Path("approval")
@Component
public class ApprovalEndpoint {
    @Autowired
    ApprovalService approvalService;

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response showAll() {
//        Iterable<Approval> approvals = approvalService.giveAll();
//        return Response.ok(approvals).build();
//    }
}
