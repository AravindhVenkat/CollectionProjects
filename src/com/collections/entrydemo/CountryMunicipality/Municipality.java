package com.collections.entrydemo.CountryMunicipality;

import java.util.Map.Entry;

public class Municipality
{
	public static Country country = new Country();
	
	public static void getTotalPopulation(Country c)
	{
		long s = 0L;
		for(Entry<String,Integer> e:country.getHm().entrySet())
		{
			s = s+e.getValue();
		}
		System.out.println("Total Population : "+s);
	}
	
	public static void getStateNameOverNPopulation(Country c, long N)
	{
		for(Entry<String,Integer> e:country.getHm().entrySet())
		{
			if(e.getValue()>N)
			{
				String str = e.getKey()+" "+e.getValue();
				System.out.println(str);
			}
		} 
	}
	
	public static void modifyStatePopulationBasedOnStateName(String stateName, int population)
	{
		for(Entry<String,Integer> e:country.getHm().entrySet())
		{
			if(e.getValue()==0) country.getHm().put(e.getKey(), population);
		}
		System.out.println(country.getHm());
	}
	
	public static void getPopulationByStateName(Country c, String statename)
	{
		for(Entry<String,Integer> e:country.getHm().entrySet()) 
		{
			System.out.println("<"+e.getKey()+">"+"\t"+"<"+e.getValue()+">");
		}
	}
	
	public static void main(String[] args)
	{
		Country c1 = new Country();
		Country c2 = new Country();
		Country c3 = new Country();
		
		getTotalPopulation(c1);
		getStateNameOverNPopulation(c2, 8465846L);
		modifyStatePopulationBasedOnStateName("Tamil Nadu", 4548);
		getPopulationByStateName(c3, "Tamil Nadu");
	}
	

}
