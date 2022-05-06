package com.sip.ams.entities;

public class AuthenticationBean {
 public String message ;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public AuthenticationBean(String message) {
	super();
	this.message = message;
} 
 
@Override
public String toString() {
	return String.format("Bienvenue dans backend [message=%s]", message);

}
}
