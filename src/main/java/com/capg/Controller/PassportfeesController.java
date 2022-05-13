package com.capg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.Passport_Fees;
import com.capg.Service.PassportfeesService;


@RestController
@RequestMapping("/Passportfees")
public class PassportfeesController {
	@Autowired
	PassportfeesService service;
	
	@PostMapping("/addPassportfees")
	public ResponseEntity<Passport_Fees> addPassportfees(@Validated @RequestBody Passport_Fees passprtfees){

		Passport_Fees ps=service.addPassportfees(passprtfees);
		return new ResponseEntity<Passport_Fees>(ps,HttpStatus.OK);
		
		
	
		
	}
		
	}
	
	
	

	


