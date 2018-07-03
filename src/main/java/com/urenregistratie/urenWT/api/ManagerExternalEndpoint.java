package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.ManagerExternalService;
import com.urenregistratie.urenWT.domain.ManagerExternal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/user/manager_external")
@Component
public class ManagerExternalEndpoint {
    @Autowired
    ManagerExternalService managerExternalService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<ManagerExternal> managersExternal = this.managerExternalService.giveAll();
        return Response.ok(managersExternal).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getManagerExternalById(@PathParam("id") Long id){
        if(this.managerExternalService.existsById(id)) {
            ManagerExternal managerExternal = this.managerExternalService.findById(id);
            return Response.ok(managerExternal).build();
        }
        System.out.println("ManagerExternal id in GET not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postManagerExternal(ManagerExternal managerExternal){
        if(managerExternal != null){
            ManagerExternal result = this.managerExternalService.save(managerExternal);
            return Response.accepted(result.getUserID()).build();
        }
        System.out.println("ManagerExternal in POST is null!");
        return Response.status(Status.INTERNAL_SERVER_ERROR).build();
    }

    //  @EDIT
    //  @PUT
    @POST
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateManagerExternal(@PathParam("id") Long id, ManagerExternal managerExternalEdit){
        if(this.managerExternalService.existsById(id)) {
            ManagerExternal manEdit = this.managerExternalService.findById(id);

            manEdit.setFirstName(managerExternalEdit.getFirstName());
            manEdit.setLastName(managerExternalEdit.getLastName());
            manEdit.setEmailAddress(managerExternalEdit.getEmailAddress());
            manEdit.setTelephoneNumber(managerExternalEdit.getTelephoneNumber());
            manEdit.setPassword(managerExternalEdit.getPassword());
            manEdit.setDateOfBirth(managerExternalEdit.getDateOfBirth());
            manEdit.setCompany(managerExternalEdit.getCompany());

            ManagerExternal result = this.managerExternalService.save(manEdit);
            return Response.accepted(result.getUserID()).build();
        }
        System.out.println("ManagerExternal id in PUT not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteManagerExternal(@QueryParam("id") Long id) {
        if(this.managerExternalService.existsById(id)) {
            this.managerExternalService.deleteById(id);
            System.out.println("Deleted ManagerExternal account with id: " + id);
            return Response.noContent().build();
        }
        System.out.println("ManagerExternal id in DELETE not found!");
        return Response.status(Status.NOT_FOUND).build();
    }
}
