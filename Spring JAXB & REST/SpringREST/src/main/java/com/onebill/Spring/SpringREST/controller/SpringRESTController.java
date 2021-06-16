package com.onebill.Spring.SpringREST.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SpringRESTController {
	
	@GetMapping(path  = "/hello" , produces = {MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE})
	public Object getData() {
		return "Hello Rathesh";
	}

}
