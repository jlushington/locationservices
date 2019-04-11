package com.nodedynamics.locationservices.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.nodedynamics.locationservices.model.location.LocationModel;
import com.nodedynamics.locationservices.service.location.LocationService;

import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/location")
public class LocationController {
	
	Logger log = LoggerFactory.getLogger(LocationController.class);
	
	@Autowired
	Gson gson;
	
	@Autowired
	LocationService service;
	
	@CrossOrigin(origins = "*") //TODO: NEED TO REMOVE AND INIT PROPER CORS
	@PostMapping(value = "/addlocation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> AddLocation(@RequestBody String request){
    	return service.Store(gson.fromJson(request, LocationModel.class));
    }
	
	@PostMapping(value = "/getlocation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> GetLocation(@RequestBody String request){
    	return service.Get(gson.fromJson(request, LocationModel.class));
    }
	
	@CrossOrigin(origins = "*") //TODO: NEED TO REMOVE AND INIT PROPER CORS
	@GetMapping(value = "/getalllocation")
	public Mono<String> GetAllLocation(){
    	return service.GetAll();
    }
	
	@PostMapping(value = "/updatelocation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> UpdateLocation(@RequestBody String request){
    	return service.Update(gson.fromJson(request, LocationModel.class));
    }
	
	@PostMapping(value = "/deletelocation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> DeleteLocation(@RequestBody String request){
    	return service.Delete(gson.fromJson(request, LocationModel.class));
    }
	

}
