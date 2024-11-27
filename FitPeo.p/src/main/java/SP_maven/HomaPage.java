package SP_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.devtools.*;
import org.openqa.selenium.remote.*;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class HomaPage
{
	public static void main(String[]args) throws Exception 
	{
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
	     driver.manage().window().maximize();
		driver.navigate().to("https://web.whatsapp.com/");
		Thread.sleep(3000);
	//	driver.findElement();
		System.out.println("open browser");
	}

}*/
		
		        // Set the path for the EdgeDriver executable
		//System.setProperty("webdriver.egde.driver","C:\\Edge Browser\\edgedriver_win64 (5).exe");
		   System.setProperty("webdriver.edge.driver", "C:\\Chrome browser\\msedgedriver.exe");

		        // Initialize Edge WebDriver
		        WebDriver driver = new ChromeDriver();

		        try {
		            // Open the application URL
		        	 Thread.sleep(5000);
		            driver.get("https://selenium-apps.doselect.in/age-calculator/");
		    //      System.out.sprintln("Doselect Application open");
		            Thread.sleep(3000);
		            // Maximize the browser window
		            driver.manage().window().maximize();
		            System.out.println("Task 1: Doselect Application open");

		            // Perform actions on the page
		            Thread.sleep(5000);
		            WebElement birthDateInput = driver.findElement(By.id("birth_date"));
		            Thread.sleep(5000);
		         // WebElement birthDateInput = driver.findElement(By.id("birth_date"));
		            birthDateInput.sendKeys("05/06/1999");  
		            System.out.println("Task 2:user birthdate ");
		            
                   Thread.sleep(5000);
		           WebElement calculateButton = driver.findElement(By.id("calculate"));
		           
		           calculateButton.click();
		           Thread.sleep(5000);
		           System.out.println("Task 3: calculate Age = 25y/05M/20days");
		           
		          Thread.sleep(5000);
		           WebElement dateInput = driver.findElement(By.xpath("//input[@type='date']"));      
		           dateInput.sendKeys("26/02/2000");
		           Thread.sleep(5000);
		           System.out.println("Task 4 : Find the date 26/02/2000");



		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the browser
		            driver.quit();
		        }
		    }
		}

