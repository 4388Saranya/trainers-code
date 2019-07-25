package Webdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jar files\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(3000);
		//getwindowhandles will tell me how many tabs are present
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		//switch to is a command used to switch between tabs/browser
		driver.switchTo().window(tabs.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(tabs.get(0));
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title1.equals(title))
		{
			System.out.println("The Title is same");
		}
		else
		{
			System.out.println("The Title is not same");
		}
	}		

}
