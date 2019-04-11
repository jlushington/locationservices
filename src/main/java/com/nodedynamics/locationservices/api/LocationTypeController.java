package com.nodedynamics.locationservices.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.nodedynamics.locationservices.model.location.LocationTypeModel;
import com.nodedynamics.locationservices.service.location.LocationTypeService;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/locationtype")
public class LocationTypeController {
	
Logger log = LoggerFactory.getLogger(LocationTypeController.class);
	
	@Autowired
	Gson gson;
	
	@Autowired
	LocationTypeService service;
	
	@PostMapping(value = "/addlocationtype", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> AddLocationType(@RequestBody @Valid  LocationTypeModel request){
    	return service.Store(request);
    }
	
	@PostMapping(value = "/getlocationtype", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> GetLocationType(@RequestBody String request){
    	return service.Get(gson.fromJson(request, LocationTypeModel.class));
    }
	
	@GetMapping(value = "/getalllocationtype")
	public Mono<String> GetAllLocationType(@RequestBody String request){
    	return service.GetAll();
    }
	
	@PostMapping(value = "/updatelocationtype", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> UpdateLocationType(@RequestBody String request){
    	return service.Update(gson.fromJson(request, LocationTypeModel.class));
    }
	
	@PostMapping(value = "/deletelocationtype", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> DeleteLocationType(@RequestBody String request){
    	return service.Delete(gson.fromJson(request, LocationTypeModel.class));
    }

}
