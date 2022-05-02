package com.selenium;

import java.util.Arrays;
import java.util.List;

import com.beust.jcommander.internal.Lists;

public class Array {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		Array z= new Array();
		
		z.finalize();
		
		System.gc();
		
		int[] a = { 1, 2, 3, 4, 5 };
		int n= 0;
		for (int j = 0; j < n; j++) {
			int first = a[0];

			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = first;
		}
		System.out.println(Arrays.toString(a));
	}
}
