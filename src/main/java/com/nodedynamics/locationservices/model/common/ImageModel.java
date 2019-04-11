package com.nodedynamics.locationservices.model.common;



import org.springframework.data.annotation.Id;

import com.nodedynamics.locationservices.model.CoreModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class ImageModel extends CoreModel{
	
	@Id
	private String ImageID;
	private String ImageName;
	private String ImageLoc;
	private String ImageDescription;
	private String ImageType;
	private int LoginID;
	private int ProductID;
	private int UserTypeID;
	private int VendorID;
	private int VendorStoreID;


}
