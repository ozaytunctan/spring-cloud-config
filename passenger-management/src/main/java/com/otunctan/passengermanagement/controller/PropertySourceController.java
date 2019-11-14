package com.otunctan.passengermanagement.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class PropertySourceController {

	
	@Value("${global.param.env}")
	private String env;
	
	@GetMapping(path = "/getEnviroment")
	public ResponseEntity<String> getResources(){
	   
		return ResponseEntity.status(HttpStatus.OK).body(env);
	}
	
}
