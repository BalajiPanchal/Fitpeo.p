package SP_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageWhatspp
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("Open Facebook Page");
		
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9623347487");
		driver.findElement(By.id("email")).sendKeys("9623347487");
		driver.findElement(By.id("pass")).sendKeys("Anna@3829");
		
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//input[@id=\'facebook\']/body"))).build().perform();
		ac.perform();
		//driver.findElement(By.name("login")).click();
		//Thread.sleep(3000);
		
	}}