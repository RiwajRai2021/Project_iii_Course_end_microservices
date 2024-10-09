package com.project_module_iii.project_BookingCabMS.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@JsonIgnoreProperties
@Entity
public class Cab {
		
	//Fields
	//Cab Information
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("cabId")
	private Integer CabId;
	@JsonProperty("fromLocation")
	private String FromLocation; 
	@JsonProperty("toLocation")
	private String ToLocation;
	@JsonProperty("typeOfCab")
	private Integer TypeOfCab; 
	
	
	@JsonProperty("rate")
	private Double rate;

	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cab(Integer cabId, String fromLocation, String toLocation, Integer typeOfCab, Double rate) {
		CabId = cabId;
		FromLocation = fromLocation;
		ToLocation = toLocation;
		TypeOfCab = typeOfCab;
		this.rate = rate;
	}

	public Integer getCabId() {
		return CabId;
	}

	public void setCabId(Integer cabId) {
		CabId = cabId;
	}

	public String getFromLocation() {
		return FromLocation;
	}

	public void setFromLocation(String fromLocation) {
		FromLocation = fromLocation;
	}

	public String getToLocation() {
		return ToLocation;
	}

	public void setToLocation(String toLocation) {
		ToLocation = toLocation;
	}

	public Integer getTypeOfCab() {
		return TypeOfCab;
	}

	public void setTypeOfCab(Integer typeOfCab) {
		TypeOfCab = typeOfCab;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Cab [CabId=" + CabId + ", FromLocation=" + FromLocation + ", ToLocation=" + ToLocation + ", TypeOfCab="
				+ TypeOfCab + ", rate=" + rate + "]";
	}
	
	
}
