package com.collections.hashmapdemo.CitizenAddress;

import java.util.*;

public class CitizenAddressApplication 
{
	
	static HashMap<Long,Citizen> citizensMap=new HashMap<>();
	
	public static void aadharAscending(HashMap<Long,Citizen> hm)
	{
		hm.keySet().stream().sorted().forEach(System.out::println); //printing using method reference
	}
	
	public static void CitizenAgeDesc(HashMap<Long,Citizen> hm)
	{
		hm.values().stream().sorted((o1,o2)->o2.getAge()-o1.getAge()).forEach(System.out::println);
	}

	public static void main(String[] args)
	{		
		citizensMap.put(123456789055l,new Citizen("Aravindh",22, "8248111222", "aravicoder@gmail.com", new Address(18, "Area51", "Chennai", "Tamil Nadu", 600444)));
		citizensMap.put(123456789033l,new Citizen("Ajay",17, "8248111333", "ajay@gmail.com", new Address(21, "Area62", "Thoothukudi", "Tamil Nadu", 600111)));
		citizensMap.put(123456789077l,new Citizen("Bala",28, "8248111444", "bm@gmail.com", new Address(30, "Area73", "Trichy", "Tamil Nadu", 600222)));
		citizensMap.put(123456789011l,new Citizen("Deepak",69, "8248111555", "deepak@gmail.com", new Address(54, "Area84", "Chennai", "Tamil Nadu", 600333)));
				
		System.out.println("Show Aadhar Ascending:"+"\n");
		aadharAscending(citizensMap);
		System.out.println("\n");
		
		System.out.println("Citizen Oldest to Youngest:"+"\n");
		CitizenAgeDesc(citizensMap);
	}

}
