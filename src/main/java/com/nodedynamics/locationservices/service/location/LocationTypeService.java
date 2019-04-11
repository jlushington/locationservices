package com.nodedynamics.locationservices.service.location;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.WebSession;
import com.google.gson.Gson;
import com.nodedynamics.locationservices.common.Global;
import com.nodedynamics.locationservices.model.common.ResponseModel;
import com.nodedynamics.locationservices.model.location.LocationTypeModel;
import com.nodedynamics.locationservices.repo.LocationTypeRepository;
import com.nodedynamics.locationservices.service.BaseService;

import reactor.core.publisher.Mono;

@Service
public class LocationTypeService implements BaseService<LocationTypeModel>{
	
	Logger log = LoggerFactory.getLogger(LocationTypeService.class);
	
	private WebSession Session;
	
	@Autowired
	private LocationTypeRepository repo;
	
	@Autowired
	Gson gson = new Gson();

	

	@Override
	public void Init(WebSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mono<String> Store(LocationTypeModel Model) {
		
		//SAVE MODEL
		repo.save(Model);
		
		return Mono.just(gson.toJson(ResponseModel.builder()
				.MessageTypeID(Global.MessageTypeID.SUCCESS.key)
				.MessageType(Global.MessageType.SUCCESS.key)
				.Message("Location Type Successfully Added")
				.build()));
		
	}

	@Override
	public Mono<String> Update(LocationTypeModel Model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<String> DeleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<String> Delete(LocationTypeModel Model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<String> GetAll() {
		return Mono.just(gson.toJson(repo.findAll()));
	}

	@Override
	public Mono<String> Get(LocationTypeModel Model) {
		// TODO Auto-generated method stub
		return null;
	}

}
