package com.atmecs.CustomerDetails;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 * This class is used to read customer details into json file
 * @author Anne.Sivakumar
 *
 */
public class ReadingCustomerDetails {
	/**
	 * read customer details(first name,,middle name,last name,age,address,phone,gender,email id) into the json file
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	static void ReadCustomerDetailsIntoJSON() throws FileNotFoundException, IOException, ParseException
	{
		Logger log=Logger.getLogger("log information");
		// parsing file "JSONExample.json" 
		Object object=new JSONParser().parse(new FileReader("CustomerDetailsInJSONFile.json"));
		// type casting object to JSONObject 
		JSONObject jsonObject=(JSONObject)object;
		
		String firstName=(String)jsonObject.get("FirstName");
		String middleName=(String)jsonObject.get("MiddleName");
		String lastName=(String)jsonObject.get("LastName");
		String age=(String) jsonObject.get("Age");
		String gender=(String)jsonObject.get("Gender");
		log.info("FirstName:"+firstName);
		log.info("MiddleName:"+middleName);
		log.info("LastName:"+lastName);
		log.info("Age:"+age);
		log.info("Gender:"+gender);
		Map address=((Map)jsonObject.get("Address") );
		Iterator<Map.Entry> iterator1=address.entrySet().iterator();
		while(iterator1.hasNext())
		{
			Map.Entry pair=iterator1.next();
			log.info(pair.getKey()+":"+pair.getValue());
		}
		
		JSONArray jsonArray=(JSONArray)jsonObject.get("PhoneNumber");
		Iterator iterator2=jsonArray.iterator();
		while(iterator2.hasNext())
		{
			iterator1=((Map)iterator2.next()).entrySet().iterator();
			while(iterator1.hasNext())
			{
				Map.Entry pair=iterator1.next();
				log.info(pair.getKey()+":"+pair.getValue());
			}
		}
		
		String emailid=(String)jsonObject.get("Email Id");
		log.info("Email Id:"+emailid);
	}

}
