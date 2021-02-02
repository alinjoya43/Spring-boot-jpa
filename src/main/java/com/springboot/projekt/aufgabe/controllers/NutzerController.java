package com.springboot.projekt.aufgabe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.projekt.aufgabe.entities.Nutzer;
import com.springboot.projekt.aufgabe.services.NutzerServices;

@RestController
@RequestMapping("/rest/api")
public class NutzerController {
	
	@Autowired
	private NutzerServices nutzerService;
	
	@RequestMapping(path = "/create/nutzer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Nutzer> createNutzer(@RequestBody Nutzer nutzer){
		
		nutzerService.createNutzer(nutzer);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/nutzers", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getAllNutzer(){
		
		return new ResponseEntity<Object>(nutzerService.getAllNutzer(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/nutzer/{id}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getNutzerById(@PathVariable("id") Long id){
		
		return new ResponseEntity<Object>(nutzerService.getNutzerById(id), HttpStatus.OK);
	}
	@RequestMapping(path = "/delete/nutzer/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Nutzer> deleteNutzer(@PathVariable("id") Long nutzerId){
		
		nutzerService.deleteNutzer(nutzerId);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
