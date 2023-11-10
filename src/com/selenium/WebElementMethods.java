package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimal\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));// element
		email.sendKeys("abi@gmail.com");// data
		// sendkey:-we pass the input value

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("abi1234@");

		WebElement login = driver.findElement(By.name("login"));
		login.click();// click:- to click on the webelement

		WebElement email1 = driver.findElement(By.id("email"));// element
		email1.sendKeys("abi@gmail.com");// data
		String attribute = email1.getAttribute("value");// data
		System.out.println(attribute);

		WebElement email2 = driver.findElement(By.id("email"));// element
		email2.sendKeys("abi@gmail.com");// data
		String attribute1 = email2.getAttribute("name");// element
		System.out.println(attribute1);

		WebElement text = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		String text2 = text.getText();
		// gettext:-to get the text of the webelement is present in application
		System.out.println(text2);

		WebElement email3 = driver.findElement(By.id("email"));// element
		email3.sendKeys("abi@gmail.com");// data
		boolean displayed = email3.isDisplayed();
		// isdisplayed:-tocheck whether an element is visible and available in page
		System.out.println(displayed);

		WebElement email4 = driver.findElement(By.id("email"));// element
		email4.sendKeys("abi@gmail.com");// data
		boolean enabled = email4.isEnabled();
		// isenable:-tocheck whether an element is edit and click in page
		System.out.println(enabled);

		WebElement email5 = driver.findElement(By.id("email"));// element
		email5.sendKeys("abi@gmail.com");// data
		boolean selected = email5.isSelected();
		// isselected:-to check whether an element is selected and not
		System.out.println(selected);

		
		Thread.sleep(4000);
		WebElement email6 = driver.findElement(By.id("email"));// element
		email6.sendKeys("abi@gmail.com");
		email6.clear();
		//clear:-it will clear the passed data
		
	}

}
