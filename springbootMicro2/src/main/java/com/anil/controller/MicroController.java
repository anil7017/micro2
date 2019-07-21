package com.anil.controller;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController {
	
	@GetMapping(value = "/test/data")
	public ResponseEntity<String> getDetails() {

		return new ResponseEntity<String>("dhgsfhsg jgsdkfsd sgfksg sdgfksgk "+Instant.now(), HttpStatus.OK);
	}

}
