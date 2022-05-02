package com.selenium;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
	public static void main(String args[]) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\loges\\eclipse-workspace2\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
//		options.addArguments("version");
		options.addArguments("start-maximized");
//		options.addArguments("incognito");
		options.addArguments("disable-infobars");	
//		options.addArguments("disable-popup-blocking");
//		options.addArguments("headless");
//		options.addArguments("make-default-browser");
		WebDriver driver = new ChromeDriver(options);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement user = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		user.sendKeys("9976739936");
//		File destint = new File("C:\\Users\\loges\\eclipse-workspace2\\Selenium\\screenshot\\user.png");
//		FileUtils.copyFile(user, destint);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("pathname");
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		
//		WebElement flight = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[3]//following-sibling::div[5]"));
		WebElement log = driver.findElement(By.xpath("(//*[local-name()='svg'])[2]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(log).perform();
		WebElement out = driver.findElement(By.xpath("//a[@href='#']"));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		Boolean explicitly = wait.until(ExpectedConditions.stalenessOf(out));
		out.click();
		Wait wait1 = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(StaleElementReferenceException.class);
		wait1.until(new Function<WebDriver, WebElement> () {
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//a[@href='#']"));
			}
		});
			
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
//				.withTimeout(30, TimeUnit.SECONDS) 			
//				.pollingEvery(5, TimeUnit.SECONDS) 			
//				.ignoring(NoSuchElementException.class);
//		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
//		
//			public WebElement apply(WebDriver driver ) {
//				return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
//			}
//		});
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		File file = flight.getScreenshotAs(OutputType.FILE);
//		File distent = new File("C:\\Users\\loges\\eclipse-workspace2\\Selenium\\screenshot\\flight.png");
//		FileUtils.copyFile(file, distent);
//		js.executeScript("arguments[0].click();",flight);
		
		
		
		

	}
}
