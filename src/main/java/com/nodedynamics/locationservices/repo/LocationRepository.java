package com.nodedynamics.locationservices.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nodedynamics.locationservices.model.location.LocationModel;


public interface LocationRepository extends MongoRepository<LocationModel, String>{

}
