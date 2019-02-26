package com.technextgen.cab.model;

import java.util.Date;

public class CabRequestDetails {
	private String requestId;
	private Cab bookedCab;
	private int pickUpArea;
	private int dropArea;
	private Date pickTime;

	public CabRequestDetails(String requestId, int pickUpArea, int dropArea,
			Date pickTime) {
		this.requestId = requestId;
		this.pickUpArea = pickUpArea;
		this.dropArea = dropArea;
		this.pickTime = pickTime;
	}

	public String getRequestId() {
		return requestId;
	}

	public Cab getBookedCab() {
		return bookedCab;
	}

	public void setBookedCab(Cab bookedCab) {
		this.bookedCab = bookedCab;
	}

	public int getPickUpArea() {
		return pickUpArea;
	}

	public void setPickUpArea(int pickUpArea) {
		this.pickUpArea = pickUpArea;
	}

	public int getDropArea() {
		return dropArea;
	}

	public void setDropArea(int dropArea) {
		this.dropArea = dropArea;
	}

	public Date getPickTime() {
		return pickTime;
	}

	public void setPickTime(Date pickTime) {
		this.pickTime = pickTime;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public String toString() {
		return "requestId:" + requestId + " BookedCab:[ " + bookedCab
				+ " ] pickUpArea:" + pickUpArea + " pickTime:" + pickTime;
	}

}
