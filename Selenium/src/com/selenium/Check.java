package com.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.netty.util.Timeout;

public class Check {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\loges\\eclipse-workspace2\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement mobile = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		mobile.click();
		String flip = driver.getWindowHandle();
//		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.amazon.com/");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]")).click();
		System.out.println("first"+driver.getCurrentUrl());
		driver.switchTo().window(flip);
		System.out.println("second"+driver.getCurrentUrl());
//		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		driver.findElement(By.xpath("//a[text()='Offer Zone']")).click();
		String str ="welcome to java";
		
		String[] s =str.split(" ");
		StringBuffer sb = new StringBuffer();
//		System.out.println(str.length());
//		System.out.println(s.length);
		for(int i=0 ;i< s.length;i++) {
			System.out.println(s[i]);
			char c = s[i].charAt(0);
			System.out.println(c);
			char caps = Character.toUpperCase(c);
			String substr = s[i].substring(1);
			sb.append(caps).append(substr).append(" ");
		}
		String tr = sb.toString().trim();
		System.out.println(sb);
		
		
		int i =00022003000;
		String regex ="^0+(?!$)";
	    	String j = Integer.toString(i);
		 j = j.replaceAll(regex, "");
		System.out.println(j);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath(""));}

			
		});
			Wait<WebDriver> fw = new FluentWait<WebDriver>(driver)
			.withMessage(10,TimeUnit.SECONDS)
			.pollingEvery(5,TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
			fw.until(new Function<Webdriver,WebElement>(){

				@Override
				public WebElement apply(Webdriver driver) {
					return driver.findElement(By.xpath(""));
				}
				
			});
			
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
	}
}
