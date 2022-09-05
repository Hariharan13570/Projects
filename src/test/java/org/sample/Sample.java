package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		//browser launch
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//url
		driver.get("https://www.facebook.com/");
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("hari");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("1234");
		
		WebElement btnClick = driver.findElement(By.name("login"));
		btnClick.click();

	}

}
