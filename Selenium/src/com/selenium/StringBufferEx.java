package com.selenium;

public class StringBufferEx {

		public static void main(String[] args) {
			String st= "welcome";
			StringBuffer sbf = new StringBuffer(st);
//			sbf.append(st);
			System.out.println(sbf.reverse());
			System.out.println(sbf.insert(3, " to chennai "));
			System.out.println(sbf.indexOf("to"));
			System.out.println(sbf.replace(0, 3, "we are"));// it will not take last index we mention
			System.out.println(sbf.delete(0, 2));// it will not take last index we mention
			System.out.println(sbf.capacity());
			sbf.ensureCapacity(15);
			System.err.println(sbf);
			System.out.println(sbf.length());
			System.out.println(sbf.substring(5,10));
			
			
			
			
		}
}
