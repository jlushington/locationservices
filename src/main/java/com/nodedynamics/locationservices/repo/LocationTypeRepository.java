package com.nodedynamics.locationservices.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nodedynamics.locationservices.model.location.LocationTypeModel;

public interface LocationTypeRepository extends MongoRepository<LocationTypeModel, String>{

}
