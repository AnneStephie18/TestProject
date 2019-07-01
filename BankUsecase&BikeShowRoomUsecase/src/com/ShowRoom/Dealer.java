package com.ShowRoom;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Logger;
/**
 * 
 * @author Anne.Sivakumar
 *This class is used to display the model of bike,type of the bike,amount of orders from user
 */

public class Dealer {
	Scanner sc=new Scanner(System.in);
	static Logger log = Logger.getLogger(Dealer.class.getName());
	public int items;
	static ArrayList<String> vehicleList = new ArrayList<String>();
	LinkedList<String> vehicleModel1 = new LinkedList<String>();
	Vector<String> vehicleModel2 = new Vector();
	HashSet<Object> vehicleModel3 = new HashSet<Object>();
	TreeSet<Object> vehicleModel4 = new TreeSet<Object>();
	HashMap<String,String> vehicleModel5=new HashMap<String, String>();
	ArrayList<Object> vehicleModel6=new ArrayList<Object>();
	//added all elements in the arraylist  
	static {
		vehicleList.add("Honda");
		vehicleList.add("TVS");
		vehicleList.add("Suzuki");
		vehicleList.add("Hero");

	}
/**
 * return the list of elements which is stored in linkedlist based on the comparison of the brand otherwise,return no brand is available 
 * @param brand
 * @return
 */
	LinkedList<String> brand(String brand) {
		if (brand.contains("Honda")) {
			vehicleModel1.add(" Activa 5G");
			vehicleModel1.add(" Dream Neo ");
			vehicleModel1.add(" Dio");
			vehicleModel1.add(" CB Unicorn 150");
		} 
		else if(brand.contains("TVS"))
		{
			vehicleModel1.add(" Jupiter");
			vehicleModel1.add(" Apache RTR 160");
			vehicleModel1.add(" Sport");
			vehicleModel1.add(" Scooty Pep Plus");
			vehicleModel1.add(" Wego");
			vehicleModel1.add(" Radeon");
			vehicleModel1.add(" Apache RTR 160");

		}
		else if(brand.contains("Suzuki"))
		{
			vehicleModel1.add(" Gixxer SF 250");
			vehicleModel1.add(" Access 125 ");
			vehicleModel1.add(" Intruder");
			vehicleModel1.add(" Burgman Street");
			vehicleModel1.add(" GSX S750");
			vehicleModel1.add(" Gixxer SF 250");

		}
		else if(brand.contains("Hero"))
		{
			vehicleModel1.add(" Pleasure");
			vehicleModel1.add(" Maestro Edge ");
			vehicleModel1.add(" Glamour");
			vehicleModel1.add(" Passion Pro");
			vehicleModel1.add(" Splendor");

		}
		else {
			log.info("BRAND IS NOT AVAILABLE");
			System.exit(0);
		}
		return vehicleModel1;

	}
	
/**
 * based on the available model, process the amount of order given by the user and specification of bike which is stored in vector,set,map.
 * @param model
 * file handling is used to get the specification from the file to the user
 */
	public void model(String model) 
	{
		log.info("how many model do you want?" );
		 items =sc.nextInt();
		if(model.contains("Activa5G"))
		{			
			for(int i=0;i<items;i++)
			{			
			vehicleModel2.add("NAME :   Honda Activa");
			vehicleModel2.add("TYPE :   "+5+"G");
			vehicleModel2.add("COLOR:   White");
			vehicleModel2.add("SPEED:   "+60+"Kmpl");
			vehicleModel2.add("MILEAGE: "+109.19+"cc");
			vehicleModel2.add("FUEL:    Petrol "); 
			vehicleModel2.add("null");
			vehicleModel2.remove(6);
			vehicleModel2.add("WEIGHT:  "+109+"kg"+"\n");
			}
			Collections.sort(vehicleModel2);
			log.info("SPECIFICATION:");
			display(vehicleModel2);

		}
		else if(model.contains("DreamNeo"))
		{
			for(int i=0;i<items;i++)
			{
			vehicleModel3.add("NAME :   Honda Dream");
			vehicleModel3.add("COLOR:   Red");
			vehicleModel3.add("SPEED:   "+60+"Kmpl");
			vehicleModel3.add("MILEAGE: "+109.19+"cc");
			vehicleModel3.add("FUEL:    Petrol "); 
			vehicleModel3.add("WEIGHT:  "+109+"kg"+"\n");
			vehicleModel3.add("WEIGHT:  "+109+"kg");
			}				
			vehicleModel3.size();
			log.info("SPECIFICATION:");
			display(vehicleModel6);
		}
		else if(model.contains("Dio"))
		{
			for(int i=0;i<items;i++)
			{
			vehicleModel4.add("NAME :   Honda Dio");
			vehicleModel4.add("COLOR:   Blue");
			vehicleModel4.add("SPEED:   "+55+"Kmpl");
			vehicleModel4.add("MILEAGE: "+109.19+"cc");
			vehicleModel4.add("FUEL:    Petrol "); 
			vehicleModel4.add("WEIGHT:  "+104+"kg"+"\n");
			vehicleModel4.add("NAME :   Honda Dio");
			}			log.info("SPECIFICATION:");
			display(vehicleModel6);		}
		else if(model.contains("CBUnicorn150"))
		{				
			for(int i=0;i<items;i++)
			{
			vehicleModel5.put("NAME ","Honda CB Unicorn 150");
			vehicleModel5.put("COLOR ","Black");
			vehicleModel5.put("SPEED ","55Kmpl");
			vehicleModel5.put("MILEAGE ","149.2cc");
			vehicleModel5.put("FUEL ","Petrol "); 
			vehicleModel5.put("WEIGHT ","104kg"+"\n");
			
			}			
			log.info("SPECIFICATION:"+"\n");
			for(Map.Entry<String, String> entry:vehicleModel5.entrySet())
			{
				log.info(""+entry.getKey() +""+entry.getValue());
			}
		}
		else if(model.contains("ApacheRTR160"))
		{			
			for(int i=0;i<items;i++)
			{			
			vehicleModel6.add("NAME :   TVS Apache RTR 160");
			vehicleModel6.add("TYPE :   "+5+"G");
			vehicleModel6.add("COLOR:   Orange");
			vehicleModel6.add("SPEED:   "+60+"Kmpl");
			vehicleModel6.add("MILEAGE: "+109.19+"cc");
			vehicleModel6.add("FUEL:    Petrol "); 
			vehicleModel6.add("WEIGHT:  "+109+"kg"+"\n");
			}log.info("SPECIFICATION:");
			display(vehicleModel6);

		}
		else if(model.contains("Jupiter"))
		{			
			for(int i=0;i<items;i++)
			{			
			vehicleModel6.add("NAME :   TVS Jupiter");
			vehicleModel6.add("TYPE :   "+5+"G");
			vehicleModel6.add("COLOR:   PaleBlue");
			vehicleModel6.add("SPEED:   "+60+"Kmpl");
			vehicleModel6.add("MILEAGE: "+109.19+"cc");
			vehicleModel6.add("FUEL:    Petrol "); 
			vehicleModel6.add("WEIGHT:  "+109+"kg"+"\n");
			}log.info("SPECIFICATION:");
			display(vehicleModel6);

		}
		else if(model.contains("ScootyPepPlus"))
		{			
			for(int i=0;i<items;i++)
			{			
			vehicleModel6.add("NAME :   TVS Scooty Pep Plus");
			vehicleModel6.add("TYPE :   "+5+"G");
			vehicleModel6.add("COLOR:   LemonYellow");
			vehicleModel6.add("SPEED:   "+60+"Kmpl");
			vehicleModel6.add("MILEAGE: "+109.19+"cc");
			vehicleModel6.add("FUEL:    Petrol "); 
			vehicleModel6.add("WEIGHT:  "+109+"kg"+"\n");
			}log.info("SPECIFICATION:");
			display(vehicleModel6);

		}
		else if(model.contains("Wego"))
		{			
			for(int i=0;i<items;i++)
			{			
			vehicleModel6.add("NAME :   TVS Wego");
			vehicleModel6.add("TYPE :   "+5+"G");
			vehicleModel6.add("COLOR:   Ash");
			vehicleModel6.add("SPEED:   "+60+"Kmpl");
			vehicleModel6.add("MILEAGE: "+109.19+"cc");
			vehicleModel6.add("FUEL:    Petrol "); 
			vehicleModel6.add("WEIGHT:  "+109+"kg"+"\n");
			}log.info("SPECIFICATION:");
			display(vehicleModel6);

		}
		else if(model.contains("Access125"))
		{			
			for(int i=0;i<items;i++)
			{			
			vehicleModel6.add("NAME :   Suzuki Access 125");
			vehicleModel6.add("TYPE :   "+5+"G");
			vehicleModel6.add("COLOR:   Yellow");
			vehicleModel6.add("SPEED:   "+60+"Kmpl");
			vehicleModel6.add("MILEAGE: "+109.19+"cc");
			vehicleModel6.add("FUEL:    Petrol "); 
			vehicleModel6.add("WEIGHT:  "+109+"kg"+"\n");
			}log.info("SPECIFICATION:");
			display(vehicleModel6);

		}
		else if(model.contains("GixxerSF250"))
		{			
			for(int i=0;i<items;i++)
			{			
			vehicleModel6.add("NAME :   Suzuki Gixxer SF 250");
			vehicleModel6.add("TYPE :   "+5+"G");
			vehicleModel6.add("COLOR:   Blue");
			vehicleModel6.add("SPEED:   "+60+"Kmpl");
			vehicleModel6.add("MILEAGE: "+109.19+"cc");
			vehicleModel6.add("FUEL:    Petrol "); 
			vehicleModel6.add("WEIGHT:  "+109+"kg"+"\n");
			}log.info("SPECIFICATION:");
			display(vehicleModel6);

		}
		else if(model.contains("PassionPro"))
		{			
			for(int i=0;i<items;i++)
			{			
			vehicleModel6.add("NAME :   Hero Passion Pro");
			vehicleModel6.add("TYPE :   "+5+"G");
			vehicleModel6.add("COLOR:   pink");
			vehicleModel6.add("SPEED:   "+60+"Kmpl");
			vehicleModel6.add("MILEAGE: "+109.19+"cc");
			vehicleModel6.add("FUEL:    Petrol "); 
			vehicleModel6.add("WEIGHT:  "+109+"kg"+"\n");
			}log.info("SPECIFICATION:");
			display(vehicleModel6);
		}
		else if(model.contains("Splendor"))
		{	for(int i=0;i<items;i++)
		{
			try {
				String txt;
		        FileReader fip=new FileReader("C:/Users/Anne.Sivakumar/Desktop/anne/workspace/BikeShowRoomUsecase/file1.txt");
		        BufferedReader br=new BufferedReader(fip);
				while((txt=br.readLine())!=null)
				{
					log.info(""+txt);
				}
				fip.close();
			} catch ( Exception e) {
		           log.info(""+e.toString());		
		           }
			log.info("\n");
		}
		}


		else
		{
			log.info("There is not any other model" );
			System.exit(0);

		}
	
		
	}
	//wildcard  is used to print list of various elements from list,set. 
	static void display(Collection<?> list)
	{
		for(Object o:list)
		{
			log.info(""+o);
		}
		
	}

}
