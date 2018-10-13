package com.test.jersey;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Restimplementaion {
	
	public static void main(String[] args) {
		
		Client client = Client.create();
		WebResource webresource = client.resource("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		ClientResponse response= webresource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(response.getStatus()!=200) {
			
		    throw new RuntimeException("HTTP ERROR"+response.getStatus());
			
		}
		
		String output=response.getEntity(String.class);
		System.out.println(output);
	}
	
	
	

}
