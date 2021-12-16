package com.collections.arraylistdemo.basket;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BasketMain
{		
  public static int getHighestBasketQuantity(ArrayList<Basket> list) 
  {
	  return list.stream().max((o1,o2)->o1.getQty()-o2.getQty()).get().getQty(); //comparator
  }  
  
  public static int getLowestBasketQuantity(ArrayList<Basket> list)
  {
	  return list.stream().min((o1,o2)->o1.getQty()-o2.getQty()).get().getQty(); //comparator
  }
  
  public static ArrayList<Basket> rangeOfBaskets(ArrayList<Basket> list, int startingRange, int endingRange)
  {	  
	  return (ArrayList<Basket>) list.stream().filter(o->o.getQty()>=startingRange && o.getQty()<=endingRange).collect(Collectors.toList()); //filter predicates  
  }
  
  public static int totalQtyOfAllBaskets(ArrayList<Basket> list)
  {
	  return list.stream().collect(Collectors.summingInt(Basket::getQty)); //method reference
  }
	public static void main(String[] args)
	{		
		ArrayList<Basket> arrli = new ArrayList<>();
		
		arrli.add(new Basket(12345671,2));
		arrli.add(new Basket(1221215,6));
		arrli.add(new Basket(1035456,8));
		arrli.add(new Basket(10645467,4));
		arrli.add(new Basket(1025456,9));		
		
		System.out.println("Highest Basket Quantity: "+getHighestBasketQuantity(arrli));		
		System.out.println("Lowest Basket Quanity: "+getLowestBasketQuantity(arrli));		
		System.out.println("List of Baskets ranging from: "+rangeOfBaskets(arrli,3,10));		
		System.out.println("Sum of all Basket quantity: "+totalQtyOfAllBaskets(arrli));
	}
}
