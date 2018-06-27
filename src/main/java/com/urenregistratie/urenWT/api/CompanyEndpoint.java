package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.CompanyService;
import com.urenregistratie.urenWT.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("company")
@Component
public class CompanyEndpoint {
    @Autowired
    CompanyService companyService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<Company> companies = companyService.giveAll();
        return Response.ok(companies).build();
    }
}
