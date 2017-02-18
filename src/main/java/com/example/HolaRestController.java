package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.UnknownHostException;
import java.net.InetAddress;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController  // Tell Spring this is an HTTP controller capable of exposing HTTP endpoints (GET, PUT, POST, etc.).
@RequestMapping("/api") // Map specific parts of the HTTP URI path to classes, methods, and parameters in the Java code
public class HolaRestController {

	@RequestMapping(method = RequestMethod.GET, value = "/hola", produces = "text/plain")
	public String hola() throws UnknownHostException { String hostname = null;
		try {
		    hostname = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			hostname = "unknown";
			}
			return "Hola Spring Boot de " + hostname;
		}
	}
