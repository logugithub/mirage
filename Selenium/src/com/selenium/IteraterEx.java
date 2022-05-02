package com.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteraterEx {
	public static void main(String agrs[]){
		
//		List<Object> ls= new LinkedList<Object>();
//		
//		ls.add(25);
//		ls.add("java");
//		ls.add(true);
//		ls.add('d');
//		ls.add(5.7);
//		ListIterator<Object> it = ls.listIterator();
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//			
//		}
		 List<String> listObject = new ArrayList<String>();
	      listObject.add("Java");
	      listObject.add("Selenium");
	      listObject.add("Python");
	      listObject.add("Java Script");
	      listObject.add("Cloud Computing");
	      ListIterator<String> it = listObject.listIterator();
//	      System.out.println("Iterating the elements in forward direction: ");
	      while (it.hasNext()) { System.out.println(it.next()); }
//	      System.out.println("--------------------------------------------");
//	      System.out.println("Iterating the elements in backward direction: ");
	      while (it.hasPrevious()) { System.out.println(it.previous());}
	   }
		
		
	}
	
	
	
	
	
	

