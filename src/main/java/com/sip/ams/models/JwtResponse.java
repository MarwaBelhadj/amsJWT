package com.sip.ams.models;

import java.io.Serializable;

public class JwtResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private final String jwttoken;
	private final String name;
	private final String role;
	
	public JwtResponse(String jwttoken, String name, String role) {
		super();
		this.jwttoken = jwttoken;
		this.name = name;
		this.role = role;
	}

	
	public String getToken() {
	return this.jwttoken;
	}


	public String getName() {
		return name;
	}


	public String getRole() {
		return role;
	}
	
	

}
