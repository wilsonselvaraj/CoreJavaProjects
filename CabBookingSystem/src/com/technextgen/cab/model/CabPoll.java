package com.technextgen.cab.model;
/*
 * Class to Poll the Cab and update the Polled if Cab Booked   
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CabPoll {
	public List<Cab> cabPollArrList = null;

	public CabPoll() {

		cabPollArrList = new ArrayList<Cab>(30);
		cabPollArrList.add(new Cab("MH 09 MP 789", "Manoj Mishra", 100020));
		cabPollArrList.add(new Cab("MH 10 MP 789", "Raj Kumar", 100040));
		cabPollArrList.add(new Cab("MH 15 MP 789", "Pawan Gaur", 100060));
		cabPollArrList.add(new Cab("MH 16 MP 789", "Vijay Makwana", 100080));
		cabPollArrList.add(new Cab("MH 17 MP 789", "Sajit Nair", 100100));

	}

	public CabPoll(int listCapicity) {
		cabPollArrList = new ArrayList<Cab>(listCapicity);
		cabPollArrList.add(new Cab("MH 09 MP 789", "Manoj Mishra", 10002));
		cabPollArrList.add(new Cab("MH 10 MP 789", "Raj Kumar", 100040));
		cabPollArrList.add(new Cab("MH 15 MP 789", "Pawan Gaur", 100060));
		cabPollArrList.add(new Cab("MH 16 MP 789", "Vijay Makwana", 100080));
		cabPollArrList.add(new Cab("MH 17 MP 789", "Sajit Nair", 100100));
	}

	public void addTravlerDetails(Cab cab) {
		cabPollArrList.add(cab);
	}

	public List<Cab> getPolledCapDetails() {
		return cabPollArrList;
	}

	@Override
	public String toString() {
		Iterator<Cab> itr = cabPollArrList.iterator();
		System.out
				.println("%%%%%%%%%%%%%% -- CabPoll --%%%%%%%%%%%%%%%%%%%%%%%");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		return null;
	}

}
