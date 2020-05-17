package com.CompName.MavenRepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterCheck {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Surya/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
driver.navigate().to("http://services.smartbear.com/samples/TestComplete14/smartstore/");
Thread.sleep(20000);		
driver.close();

}
}