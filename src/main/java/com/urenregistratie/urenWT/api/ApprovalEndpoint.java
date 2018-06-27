package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.ApprovalService;
import com.urenregistratie.urenWT.domain.Approval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("approval")
@Component
public class ApprovalEndpoint {
    @Autowired
    ApprovalService approvalService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<Approval> approvals = approvalService.giveAll();
        return Response.ok(approvals).build();
    }
}
