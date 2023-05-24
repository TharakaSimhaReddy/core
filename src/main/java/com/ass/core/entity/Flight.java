package com.ass.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="flight_info")
public class Flight implements Serializable{
	
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="alt_key")
	private long altKey;
	
	@Column(name="flight_name")
	private String flightName;
	
	@Column(name="price")
	private String price;
	
	@Column(name="flight_number")
	private String flightNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="flight_id")
	private List<AirHosters> airHostersList;
	
	

	public List<AirHosters> getAirHostersList() {
		return airHostersList;
	}

	public void setAirHostersList(List<AirHosters> airHostersList) {
		this.airHostersList = airHostersList;
	}

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	
	

}
