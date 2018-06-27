package com.urenregistratie.urenWT.config;

import com.urenregistratie.urenWT.api.*;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		register(UserEndpoint.class);
		register(AdminEndpoint.class);
		register(CandidateEndpoint.class);
		register(EmployeeClientEndpoint.class);
		register(EmployeeWTEndpoint.class);
		register(CompanyEndpoint.class);
		register(WorksheetWTEndpoint.class);
		register(ApprovalEndpoint.class);
		register(HourEndpoint.class);
		register(YearEndpoint.class);
		register(DayEndpoint.class);

	}
}

