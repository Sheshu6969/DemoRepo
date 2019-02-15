package com.sampleCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Libs {
	@Test
	public void Login() {
		WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();        
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);      
       // driver.quit(); 
	}

}
