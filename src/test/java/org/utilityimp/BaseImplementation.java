package org.utilityimp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class BaseImplementation extends BaseClass {

	public static void main(String[] args) {
		//browser launch
		browsers("chrome");
		
		//url launch
		urlLaunch("https://www.facebook.com/");
		
		WebElement txtUser = driver.findElement(By.id("email"));
		//sendkeys(txtUser,"hari");
	//	javaScript(txtUser, "hari");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
	//	sendkeys(txtPass, "668867");
		
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
	}

}
