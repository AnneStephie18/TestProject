package com.Bank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ShowRoomVersion1 {
	public static int items;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Factory honda = new Factory();
		Collection<String> model = new ArrayList();

		model.add(" Honda ");
		model.add("TVS  ");
		model.add("Suzuki  ");
		model.add("Hero  ");
		Logger log = Logger.getLogger(ShowRoomVersion1.class.getName());
		log.info("Which model do you need?" + model);
		String md = sc.next();
		honda.model(md);
		for (Object o : honda.list1) {
			log.info("" + o);
		}

		//log.info("Details"+honda.list1);
	}

}

class Factory {
	Logger log = Logger.getLogger(Factory.class.getName());
	public Bike bike;
	ArrayList<Object> list1 = new ArrayList();

	ArrayList order(int items) {
		for (int i = 0; i < ShowRoomVersion1.items; i++) {

			list1.add(new Bike("Honda Activa  ", "5G", "yellow", "60Kmpl", 109.19, "Petrol ", 109));
		}
		return list1;

	}

	/**
	 * 
	 * @param items
	 * @return bike
	 */
	void model(String mdl) {

		if (mdl.contains("Honda")) {
			log.info("How Mnay orders do you need?");
			ShowRoomVersion1.items = ShowRoomVersion1.sc.nextInt();
			order(ShowRoomVersion1.items);
		} else if (mdl.contains("TVS")) {
			log.info("How Mnay orders do you need?");
			ShowRoomVersion1.items = ShowRoomVersion1.sc.nextInt();
			for (int i = 0; i < ShowRoomVersion1.items; i++) {

				bike = new Bike("TVS Scooty   ", "Streak", "purple", "75Kmpl", 87.8, "Petrol ", 97);
			}

			// order(ShowRoom.items);
		} else if (mdl.contains("Suzuki")) {
			// order(ShowRoom.items);
		} else if (mdl.contains("Hero")) {
			// order(ShowRoom.items);
		} else {
			log.info("This Model is Not Available");
			System.exit(0);
		}
	}
}

class Bike {
	Logger log = Logger.getLogger(Bike.class.getName());

	// public Collection<Object> list=new ArrayList();

	String bname;
	String type;
	String bcolor;
	Object mileage;
	double engine;
	String fuel;
	int weight;

	Bike(String bname, String type, String bcolor, Object mileage, double engine, String fuel, int weight) {
		this.bname = bname;
		this.type = type;
		this.bcolor = bcolor;
		this.mileage = mileage;
		this.engine = engine;
		this.fuel = fuel;
		this.weight = weight;

	}

}