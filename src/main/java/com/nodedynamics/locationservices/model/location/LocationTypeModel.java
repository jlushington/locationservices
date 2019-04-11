package com.nodedynamics.locationservices.model.location;

import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.nodedynamics.locationservices.model.CoreModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
@Document(collection="VenueLocationType")
public class LocationTypeModel extends CoreModel{
	
	@Id
	private String LocationTypeID;
	
	@NotNull(message = "Location Type Name Information must not be null")
	private String locationTypeName;
	
	@NotNull(message = "Location Type Description Information must not be null")
	private String LocationTypeDescription;
	

}
