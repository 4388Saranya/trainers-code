package Webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		//Set the chrome driver properties
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
	//opent he new instance of browsers/ will support all the browser
	WebDriver driver = new ChromeDriver();
	// How to open the browser
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//i want maximize it/API to maximize the screen
	driver.manage().window().maximize();
	String Expectedtitle = "OrangeHRM";
	//Enter the username using Sendkeys
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	String ActualTitle = driver.getTitle();
	if(Expectedtitle.equals(ActualTitle))
	{
		//Write the lines of logout
		System.out.println("if the title is same then do logout");
		driver.findElement(By.id("welcome")).click();
		//Just an option at present not food to use
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		//how to close the browser
		//Will close the active browser instance
		driver.close();
		//Mulitple browser then to close all the browser i use driver.quite()
		//driver.quit();
		//driver.close/driver.quite doesnot have return types and does not accept arguments
		
		
	}
	else
	{
		System.out.println("Expected is not equal to actual");
	}
	
	
		
		

	}

}
