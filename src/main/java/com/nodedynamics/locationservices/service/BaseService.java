package com.nodedynamics.locationservices.service;

import org.springframework.web.server.WebSession;
import com.nodedynamics.locationservices.model.CoreModel;
import reactor.core.publisher.Mono;

public interface BaseService<T extends CoreModel> {
	
	public void Init(WebSession session);
	public Mono<String> Store(T Model);
	public Mono<String> Update(T Model);
	public Mono<String> DeleteAll();
	public Mono<String> Delete(T Model); 
	public Mono<String> GetAll();
	public Mono<String> Get(T Model);

}
