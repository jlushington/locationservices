package com.nodedynamics.locationservices.model.location;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.nodedynamics.locationservices.model.CoreModel;
import com.nodedynamics.locationservices.model.common.ImageModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
@Document(collection="VenueLocation")
public class LocationModel extends CoreModel{
	
	@Id
	private String locationID;
	private Optional<List<ImageModel>>locationImages;
	
	@NotNull(message = "Location Name Information must not be null")
	private String locationName;
	
	@NotNull(message = "Location Description Information must not be null")
	private String locationDescription;
	
	@NotNull(message = "Location Address Information must not be null")
	private String locationAddress1;
	private String locationAddress2;
	
	@NotNull(message = "Location Province/State Information must not be null")
	private String locationProvinceState;
	
	@NotNull(message = "Location City Information must not be null")
	private String locationCity;
	
	@NotNull(message = "Location Postal Code/Zip Information must not be null")
	private String locationPostalCodeZip;
	
	@NotNull(message = "Location Country Information must not be null")
	private String locationCountry;
	private String locationTel;
	private String locationEmail;
	//private String locationSocialMedia;	Not Added to the Inital Version TODO
	
	@NotNull(message = "Location Type Information must not be null")
	private String LocationTypeID;
	

}
