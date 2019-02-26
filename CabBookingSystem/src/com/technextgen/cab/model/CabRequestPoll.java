package com.technextgen.cab.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CabRequestPoll {

	public List<CabRequestDetails> requestPollArrList = null;

	public CabRequestPoll() {

		requestPollArrList = new ArrayList<CabRequestDetails>(30);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 2);
		requestPollArrList.add(new CabRequestDetails("BR001", 100040, 100020,
				cal.getTime()));
		cal.add(Calendar.HOUR, 1);
		requestPollArrList.add(new CabRequestDetails("BR002", 100040, 100020,
				cal.getTime()));
		cal.add(Calendar.HOUR, 4);
		requestPollArrList.add(new CabRequestDetails("BR003", 100060, 1000100,
				cal.getTime()));
		cal.add(Calendar.HOUR, 5);
		requestPollArrList.add(new CabRequestDetails("BR004", 100000, 100060,
				cal.getTime()));
		cal.add(Calendar.HOUR, 6);
		requestPollArrList.add(new CabRequestDetails("BR005", 100080, 100020,
				cal.getTime()));

	}

	public CabRequestPoll(int listCapicity) {
		requestPollArrList = new ArrayList<CabRequestDetails>(listCapicity);
		requestPollArrList = new ArrayList<CabRequestDetails>(30);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 2);
		requestPollArrList.add(new CabRequestDetails("BR001", 100040, 100020,
				cal.getTime()));
		cal.add(Calendar.HOUR, 1);
		requestPollArrList.add(new CabRequestDetails("BR002", 100040, 100020,
				cal.getTime()));
		cal.add(Calendar.HOUR, 4);
		requestPollArrList.add(new CabRequestDetails("BR003", 100060, 1000100,
				cal.getTime()));
		cal.add(Calendar.HOUR, 5);
		requestPollArrList.add(new CabRequestDetails("BR004", 100000, 100060,
				cal.getTime()));
		cal.add(Calendar.HOUR, 6);
		requestPollArrList.add(new CabRequestDetails("BR005", 100080, 100020,
				cal.getTime()));
	}

	public void addTravlerDetails(CabRequestDetails cabRequestDetails) {
		requestPollArrList.add(cabRequestDetails);
	}

	public List<CabRequestDetails> getPolledCapDetails() {
		return requestPollArrList;
	}
	///Removed the Reqest Poll if request fulfill
	public void updateRequestPoll(CabRequestDetails requestedCabBooked){
		ListIterator<CabRequestDetails> listItr = requestPollArrList.listIterator();
		while(listItr.hasNext()){
			CabRequestDetails polledcab = listItr.next();
			if(polledcab.getRequestId().equals(requestedCabBooked.getRequestId()) ){
				listItr.remove();
			}
		}
	}

	@Override
	public String toString() {
		Iterator<CabRequestDetails> itr = requestPollArrList.iterator();
		System.out
				.println("%%%%%%%%%%%%%%%--CabRequestPoll--%%%%%%%%%%%%%%%%%%%%%%");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		return null;
	}

}
