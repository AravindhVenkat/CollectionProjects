package com.collections.arraylistdemo.NameList;

import java.util.ArrayList;
import java.util.Collections;

public class NameList 
{			
	public static ArrayList<String> createNameList(String name, int noOfTimes)
	{		
		ArrayList<String> arrlist = new ArrayList<String>(Collections.nCopies(noOfTimes,name));
		return arrlist;		
	}
	
	public static ArrayList<String> modifyNameList(ArrayList<String> names, String findMe, String replaceWithMe)
	{		
		Collections.replaceAll(names, findMe, replaceWithMe);		
		return names;		
	}	

	public static void main(String[] args)
	{	
		//creating n copies of a String and storing it in a ArrayList variable
		ArrayList<String> createdList = createNameList("Aravi",3); 
		
		//strings which will not be replaced in this example
		createdList.add("Random");
		createdList.add("Values");
		
		//displaying created list
		System.out.println("Created List = " + createdList);	
		
		//replacing nickname with full name
		System.out.println("Modifying the Created List = "+modifyNameList(createdList, "Aravi", "Aravindh")); 
	}
}
