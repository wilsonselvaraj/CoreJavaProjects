package com.technextgen.cab.model;


import java.util.Date;

public class Cab {
	private String cabNumber;
	private String cabOnwerName;
	private int currentLocation;
	private Date dropTime;

	public Cab(String cabNumber, String cabOnwerName, int currentLocation) {
		this.cabNumber = cabNumber;
		this.cabOnwerName = cabOnwerName;
		this.currentLocation = currentLocation;
	}

	public String getCabNumber() {
		return cabNumber;
	}

	public String getCabOnwerName() {
		return cabOnwerName;
	}

	public int getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(int currentLocation) {
		this.currentLocation = currentLocation;
	}

	public Date getDropTime() {
		return dropTime;
	}

	@Override
	public String toString() {

		return "cabNumber:" + cabNumber + " cabOnwerName:" + cabOnwerName
				+ " currentLocation:" + currentLocation;
	}

}
