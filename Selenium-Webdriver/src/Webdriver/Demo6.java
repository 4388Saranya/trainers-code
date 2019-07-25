package Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jar files\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://realestate.upskills.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		driver.findElement(By.name("login")).click();
		String title1 = driver.getCurrentUrl();
		System.out.println(title1);
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act = new Actions(driver);
		act.contextClick(link).build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		String title2 = driver.getCurrentUrl();
		System.out.println(title2);
		if(title1.equals(title2))
		{
			System.out.println("Title are same");
		}
		else
		{
			System.out.println("Title are not same");
		}
	}

}
