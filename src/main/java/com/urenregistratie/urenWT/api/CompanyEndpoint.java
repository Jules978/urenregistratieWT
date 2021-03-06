package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.CompanyService;
import com.urenregistratie.urenWT.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("company")
@Component
public class CompanyEndpoint {
    @Autowired
    CompanyService companyService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<Company> companies = this.companyService.giveAll();
        return Response.ok(companies).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCompanyById(@PathParam("id") Long id){
        if(this.companyService.existsById(id)) {
            Company company = this.companyService.findById(id);
            return Response.ok(company).build();
        }
        System.out.println("Company id in GET not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postCompany(Company company){
        if(company != null){
            Company result = this.companyService.save(company);
            return Response.accepted(result.getCompanyID()).build();
        }
        System.out.println("Company in POST is null!");
        return Response.status(Status.INTERNAL_SERVER_ERROR).build();
    }

    //    @PUT
    @POST
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCompany(@PathParam("id") Long id, Company companyEdit){
        if(this.companyService.existsById(id)) {
            Company comEdit = this.companyService.findById(id);
            comEdit.setCompanyName(companyEdit.getCompanyName());
            comEdit.setAddressLine1(companyEdit.getAddressLine1());
            comEdit.setAddressLine2(companyEdit.getAddressLine2());
            comEdit.setZipCode(companyEdit.getZipCode());
            comEdit.setCity(companyEdit.getCity());
            comEdit.setEmailAddress(companyEdit.getEmailAddress());
            comEdit.setTelephoneNumber(companyEdit.getTelephoneNumber());
            comEdit.setSalary(companyEdit.getSalary());

            Company result = this.companyService.save(comEdit);
            return Response.accepted(result.getCompanyID()).build();
        }
        System.out.println("Company id in PUT not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteCompany(@QueryParam("id") Long id) {
        if(this.companyService.existsById(id)) {
            this.companyService.deleteById(id);
            System.out.println("Deleted Company account with id: " + id);
            return Response.noContent().build();
        }
        System.out.println("Company id in DELETE not found!");
        return Response.status(Status.NOT_FOUND).build();
    }
}
