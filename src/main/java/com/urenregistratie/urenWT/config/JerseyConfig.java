package com.urenregistratie.urenWT.config;

import com.urenregistratie.urenWT.api.*;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		register(EmployeeWTEndpoint.class);
		register(CompanyEndpoint.class);
		register(CandidateEndpoint.class);
		register(ManagerExternalEndpoint.class);
		register(ManagerExternalEndpoint.class);
	}
}

