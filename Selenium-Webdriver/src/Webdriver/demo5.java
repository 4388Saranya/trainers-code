package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://elearning.upskills.in");
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.id("form-login_submitAuth")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();

	}

}
