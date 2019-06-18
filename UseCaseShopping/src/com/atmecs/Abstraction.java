package com.atmecs;

public class Abstraction {
	public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }

}
 abstract class Bike {
    Bike() {
        System.out.println("Bike created");
    }
 
    abstract void run();
 
    void changeGear() {
        System.out.println("Gear changed");
    }
}
 

class Honda extends Bike {
    void run() {
        System.out.println("Bike is running safely...");
    }
}
 
