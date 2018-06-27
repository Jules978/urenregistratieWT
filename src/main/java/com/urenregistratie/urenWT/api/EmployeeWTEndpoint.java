package com.urenregistratie.urenWT.api;

import com.urenregistratie.urenWT.controller.EmployeeWTService;
import com.urenregistratie.urenWT.domain.EmployeeWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/user/employee_wt")
@Component
public class EmployeeWTEndpoint {
    @Autowired
    EmployeeWTService employeeWTService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response showAll() {
        Iterable<EmployeeWT> employees = this.employeeWTService.giveAll();
        return Response.ok(employees).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployeeById(@PathParam("id") Long id){
        if(this.employeeWTService.existsById(id)) {
            EmployeeWT employee = this.employeeWTService.findById(id);
            return Response.ok(employee).build();
        }
        System.out.println("EmployeeWT id in GET not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postEmployee(EmployeeWT employee){
        if(employee != null){
            EmployeeWT result = this.employeeWTService.save(employee);
            return Response.accepted(result.getID()).build();
        }
        System.out.println("EmployeeWT in POST is null!");
        return Response.status(Status.INTERNAL_SERVER_ERROR).build();
    }

    @PUT
    @Path("{id}/edit")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response editEmployee(@PathParam("id") Long id, EmployeeWT employeeEdit){
        if(this.employeeWTService.existsById(id)) {
            EmployeeWT empEdit = this.employeeWTService.findById(id);

            empEdit.setFirstName(employeeEdit.getFirstName());
            empEdit.setLastName(employeeEdit.getLastName());
            empEdit.setemailAdress(employeeEdit.getemailAdress());
            empEdit.setTelephoneNumber(employeeEdit.getTelephoneNumber());

            EmployeeWT result = this.employeeWTService.save(empEdit);
            return Response.accepted(result.getID()).build();
        }
        System.out.println("EmployeeWT id in PUT not found!");
        return Response.status(Status.NOT_FOUND).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteEmployee(@QueryParam("id") Long id) {
        if(this.employeeWTService.existsById(id)) {
            this.employeeWTService.deleteById(id);
            System.out.println("Deleted EmployeeWT account with id: " + id);
            return Response.noContent().build();
        }
        System.out.println("EmployeeWT id in DELETE not found!");
        return Response.status(Status.NOT_FOUND).build();
    }
}
