package com.ShowRoom;

import java.awt.Component;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Anne.Sivakumar
 *This class is used to write,read,search the customer details in file
 */

public class RegistrationCustomerDetails{
	Scanner sc = new Scanner(System.in);
	Customer customer;
	public ArrayList<Object> list=new ArrayList();
	public ArrayList<Customer> list1=new ArrayList();;
	public Object o;
    final String f="C:/Users/Anne.Sivakumar/Desktop/anne/workspace/BikeShowRoomUseCase/CustomerDetails.txt";
    /**
     * get the details from the customer and write the customer details into the file
     */
public void WriteCustomerDetails()
{

    try
	{
		File file = new File(f);
		if (file.exists() == false) 
		{
			if (file.createNewFile()) 
			{
				System.out.println("file created");
			} 
			else {
				System.out.println("failed");
				System.exit(0);
			}
		}
		System.out.println("Firstname: ");
		String firstname=sc.next();
		customer.setFirstname(firstname);
		System.out.println("lastname: ");
		String lastname = sc.next();
		customer.setLastname(lastname);
		System.out.println("Age: ");
		int age = sc.nextInt();
		customer.setAge(age);
		System.out.println("Phone: ");
		int phone = sc.nextInt();
		customer.setPhone(phone);
		System.out.println("Sex: ");
		String sex = sc.next();
		customer.setSex(sex);
		System.out.println("Address: ");
		String address = sc.next();
		customer.setAddress(address);
		System.out.println("City: ");
		String city = sc.next();
		customer.setCity(city);
		System.out.println("State: ");
		String state = sc.next();
		customer.setState(state);
		System.out.println("Pincode: ");
		int pincode = sc.nextInt();
		customer.setPincode(pincode);
		System.out.println("Country: ");
		String country = sc.next();
		customer.setCountry(country);
		System.out.println("Email: ");
		String email = sc.next();
		customer.setEmail(email);
		FileWriter fos=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fos);
        bw.write("Firstname: "+customer.getFirstname()+"\n");
        bw.write("Lastname: "+customer.getLastname()+"\n");
		bw.write("Age: "+customer.getAge()+"\n");
		bw.write("Phone Number: "+customer.getPhone()+"\n");
		bw.write("Sex: "+customer.getSex()+"\n");
		bw.write("Address: "+customer.getAddress()+"\n");
		bw.write("City: "+customer.getCity()+"\n");
		bw.write("State: "+customer.getState()+"\n");
		bw.write("Pincode: "+customer.getPincode()+"\n");
		bw.write("Country: "+customer.getCountry()+"\n");
		bw.write("Email: "+customer.getEmail()+"\n");
		bw.flush();
		fos.close();

	}
     catch(Exception e)
	{
        System.out.println(e.toString());
	}
  }
/**
 * read the customer details from the file
 */
public void ReadCustomerDetails()
{
	try {
		String txt;
        FileReader fip=new FileReader("C:/Users/Anne.Sivakumar/Desktop/anne/workspace/BikeShowRoomUsecase/CustomerDetails.txt");
        BufferedReader br=new BufferedReader(fip);
		while((txt=br.readLine())!=null)
		{
			list.add(txt);
		}
		for(Object o:list)
		{
		System.out.println(o);
		}

		fip.close();
	} catch ( Exception e) {
		System.out.println(e.toString());
           }
	 }
/**
 * search the customer details in the file
 */
	void Search() {

		System.out.println("Please enter the word you would like to search for: ");
		String word = sc.nextLine();

		try {
			File f = new File("C:/Users/Anne.Sivakumar/Desktop/anne/workspace/BikeShowRoomUsecase/CustomerDetails.txt");
			if (f.exists()) {
				BufferedReader br = new BufferedReader(new FileReader(f));
				String line;
				String[] words;
				int i;
				while ((line = br.readLine()) != null) {
					words = line.split(":");
					for (i = 0; i < words.length; i++) {
						if (words[i].equals(word)) {
							for (int j = 0; j < words.length; j++) {
								System.out.print(words[j] + " ");
							}
						}
					}
				}

			} else {
				System.out.println("File not found");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
            
 }
        
 
}