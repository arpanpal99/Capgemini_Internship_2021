package com.cgi.custrestexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/customerrest")
public class CustomerRest {
	
	@GET
	@Produces("text/html")
	public String sayHello(){
		return "Hello!!!";
	}

	@GET
	@Produces("text/html")
	@Path("/bye")
	public String sayBye(){
		return "Byeeeeeee!!!";
	}
}
