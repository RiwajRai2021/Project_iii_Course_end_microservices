package com.project_module_iii.project_BookingCabMS.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@JsonIgnoreProperties
@Entity
public class Booking {
	
	@Id
	@JsonProperty
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id; 
	
	@JsonProperty("carRate")
	private Integer carRate;
	@JsonProperty("distance")
	private Integer distance; 
	@JsonProperty("totalFare")
	private Double totalFare;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Booking(Integer carRate, Integer distance, Double totalFare) {
		this.carRate = carRate;
		this.distance = distance;
		this.totalFare = totalFare;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCarRate() {
		return carRate;
	}

	public void setCarRate(Integer carRate) {
		this.carRate = carRate;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(Double totalFare) {
		this.totalFare = totalFare;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", carRate=" + carRate + ", distance=" + distance + ", totalFare=" + totalFare
				+ "]";
	} 
	
	
	
}
