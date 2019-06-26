package com.atmecs.thread;
import java.lang.Comparable;


public class Laptop implements Comparable<Laptop>
{

	
	public Laptop(String brand, int ram, int price) {
		this.brand=brand;
		this.ram=ram;
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	
	
	 String brand;
	 int ram;
	 int price;
	
		
		@Override
		public int compareTo(Laptop l1) {
			
			return this.price>l1.price?-1:this.price<l1.price?1:0;
		}
}
