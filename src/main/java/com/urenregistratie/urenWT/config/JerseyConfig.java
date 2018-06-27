package com.urenregistratie.urenWT.config;

import com.urenregistratie.urenWT.api.UserEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		register(UserEndpoint.class);

	}
}

