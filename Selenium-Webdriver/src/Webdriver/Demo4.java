package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Performance")).click();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement e:links)
		{
			String text =e.getText();
			System.out.println(text);
		}
		

	}

}
