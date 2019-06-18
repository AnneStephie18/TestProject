package com.atmecs;

public class Interface {
	public static void main(String[] args) {
		Bank b = new Axis();
		Bank b1 = new ICICI();
		System.out.println("Rate of Interest : " + b.rateOfInterest());
		System.out.println("Rate of Interest : " + b1.rateOfInterest());
	}
}

interface Bank {
	double rateOfInterest();
}

class Axis implements Bank {
	double p=40000;
	int n=2;
	double r=0.05;
	public double rateOfInterest() {
		double a=p*n*r/100;
		return a;
	}
}

class ICICI implements Bank {
	double p=20000;
	int n=1;
	double r=0.02;
	public double rateOfInterest() {
		double amt=p*n*r/100;
		return amt;
	}
}
