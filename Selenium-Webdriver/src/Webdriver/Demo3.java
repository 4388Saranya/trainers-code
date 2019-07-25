package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		}
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}
		//1st option
		sel.selectByVisibleText("2");
		Thread.sleep(2000);
		//2nd option
		sel.selectByIndex(2);
		Thread.sleep(2000);
		//3rd option
		sel.selectByValue("1");
		
		driver.findElement(By.xpath("//*[@name='servClass'and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("sunil");
		driver.findElement(By.name("passLast0")).sendKeys("nagaraj");
		driver.findElement(By.name("creditnumber")).sendKeys("1234 1234 1234");
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
	/*	for(WebElement e:checkbox)
		{
			e.click();
		}*/
		
		for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		


	}

}
