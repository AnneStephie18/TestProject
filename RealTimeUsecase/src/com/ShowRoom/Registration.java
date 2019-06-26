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

public class Registration {
	Scanner sc = new Scanner(System.in);
	Customer customer;
	public ArrayList<Object> list=new ArrayList();
	public ArrayList<Customer> list1=new ArrayList();;
	public Object o;
    final String f="C:/Users/Anne.Sivakumar/Desktop/anne/workspace/BikeShowRoomUseCase/CustomerDetails.txt";
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
		//list.add(firstname);
		System.out.println("lastname: ");
		String lastname = sc.next();
		//list.add(lastname);
		System.out.println("Age: ");
		int age = sc.nextInt();
		//list.add(age);
		System.out.println("Phone: ");
		long phone = sc.nextInt();
		System.out.println("Sex: ");
		String sex = sc.next();
		System.out.println("Address: ");
		String address = sc.next();
		System.out.println("City: ");
		String city = sc.next();
		System.out.println("State: ");
		String state = sc.next();
		System.out.println("Pincode: ");
		int pincode = sc.nextInt();
		System.out.println("Country: ");
		String country = sc.next();
		System.out.println("Email: ");
		String email = sc.next();
		FileWriter fos=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fos);
        bw.write("Firstname: "+firstname+"\n");
        bw.write("Lastname: "+lastname+"\n");
		bw.write("Age: "+age+"\n");
		bw.write("Phone Number: "+phone+"\n");
		bw.write("Sex: "+sex+"\n");
		bw.write("Address: "+address+"\n");
		bw.write("City: "+city+"\n");
		bw.write("State: "+state+"\n");
		bw.write("Pincode: "+pincode+"\n");
		bw.write("Country: "+country+"\n");
		bw.write("Email: "+email+"\n");
		bw.flush();
		fos.close();

	}
     catch(Exception e)
	{
        System.out.println(e.toString());
	}
  }
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