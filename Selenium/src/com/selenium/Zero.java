package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.interning.qual.CompareToMethod;

public class Zero {
	public static void main(String[] args)  {

		int a[]= {2,1,3,8,9};
		int b[]= {9,8,7,2,4,0};
		int m[]=new int[a.length+b.length];
		int c=0;
		for (int i = 0; i < a.length; i++) {
			m[c]=a[i];
			c++;
		}
		for (int i = 0; i < b.length; i++) {
			m[c]=b[i];
			c++;
		}
		List list = new ArrayList<>(Arrays.asList(m));
//		boolean addAll = Collections.addAll(list, m);
		int d=1;
		HashMap<Integer, Integer>map= new HashMap<Integer,Integer>();
		for (int is = 0; is < list.size(); is++) {
			if (map.containsKey(is)) {
				Integer i = map.get(is);
				d++;
				map.put(is, d);
				d=0;
			}
			else {
				map.put(is, 1);
			}
			
		}
		Set<Entry<Integer,Integer>>em = map.entrySet();
		for(Entry<Integer, Integer> it:em) {
			if (it.getValue()>1) {
				Integer key = it.getKey();
				Integer value = it.getValue();
				
			
			System.out.println("dupmap"+key+"="+value);
		}
		}
//		String s="a";
//		System.out.println(s.compareTo("a"));
//		int f=10;
//		int g=10;
//		System.out.println(Integer.compare(f, g));
		
//		System.out.println("tostring"+Arrays.toString(merge));
//		for (int i : merge) {
//			
//			System.out.println("foreach"+i);
//		}
//		String str = "heaalo@$bi^MKP6561ewr#$36";
//		String stp = str.replaceAll("[^a-zA-Z0-9]", "*");
//		System.out.println(stp);
//		File file = new File("C:\\Users\\loges\\workspace\\Selenium\\Credential\\login.xlsx ");
//		FileInputStream fi = new FileInputStream(file);
//		Workbook wb = new XSSFWorkbook(fi);
//		Sheet sheetAt = wb.getSheet("Sheet1");
//		int phyrow = sheetAt.getPhysicalNumberOfRows();
//		for (int i = 0; i < phyrow; i++) {
//			Row row = sheetAt.getRow(i);
//			int phycell = row.getPhysicalNumberOfCells();
//			for (int j = 0; j < phycell; j++) {
//				Cell cell = row.getCell(j);
//				CellType cellType = cell.getCellType();
//				if (cellType.equals(CellType.STRING)) {
//					String stc = cell.getStringCellValue();
//					System.out.println(stc);
//				} else if (cellType.equals(CellType.NUMERIC)) {
//					double d = cell.getNumericCellValue();
//					String string = String.valueOf(d);
//					System.out.println(string);
//
//				}
//
//			}
//		}

	}
}
