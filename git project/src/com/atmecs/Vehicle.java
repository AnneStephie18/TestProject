package com.atmecs;

import java.util.logging.Logger;

import com.atmecs.OverSpeedException;
import com.atmecs.Vehicle;
//This class contain the over speed exception
public class Vehicle {
	 Logger LOGGER = Logger.getLogger(Vehicle.class.getName());
	private String name;
	private String model;
	public int seat=1;
	protected int speed;
	int fuel=10;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public  void setModel(String model) {
		 this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//whether condition of the car is start/stop calculated by reducing fuel
	public void drive()
	{
		if(fuel>0)
		{
			LOGGER.info("Driving and fuel is reduced to"+":"+fuel);
			fuel=fuel-5;
		}
		else
		{
			LOGGER.info("stopped");
		}
		
	}
	public void takeReverse()
	{
		if(fuel>0)
		{
			LOGGER.info("Taking Reverse");
			fuel=fuel-3;
		}
		else
		{
			LOGGER.info("stopped");
		}
	}
	//By providing overspeed exception ,customer able to know the state(safe/danger)
	public void overSpeed(int speed)throws OverSpeedException
	{
		
				if(speed>60)
				{
					LOGGER.info("Danger");
					throw new OverSpeedException();
			}
				else
				{
					LOGGER.info("safe");
				}	
		}
}
class OverSpeedException extends Exception
{
	
	
}



