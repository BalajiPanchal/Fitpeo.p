package SP_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fitpeo
{
	
	//private static Object sliderSection;

	public static void main(String[] args)throws Exception
	{
		System.setProperty("WebDriver.edge.driver","C:\\Edge Browser\\edgedriver_win64 (5).exe");
		//try 
		//{
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.fitpeo.com/home");
		driver.manage().window().maximize();
		System.out.println("Steps 1: Open the Fitpeo Homepage");
		Thread.sleep(5000);
		
		WebElement RevenueCalculatorlink=driver.findElement(By.linkText("Revenue Calculator"));
		RevenueCalculatorlink.click();
		System.out.println("Step 2: able to Revenue Calculator hyper links");
		Thread.sleep(4000);
		
		JavascriptExecutor Slidesection= (JavascriptExecutor)driver;
		 //System.out.println("scroll by"
		 Slidesection.executeScript("window.scrollBy(0,300)");
		 System.out.println("Steps 3 :Scroll down the page until the revenue calculator slider is visible");
		 Thread.sleep(5000);
		 
		 WebElement textfield=driver.findElement(By.xpath("//input[@type='number'"));
		 textfield.sendKeys("560");
		 System.out.println(" text field =560");
		
		/*WebElement blueSlider=driver.findElement(By.xpath("//input[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh'"));
		 Actions action=new Actions(driver);
		 
		 action.dragAndDropBy(blueSlider, 815, 0).click(blueSlider).perform();
		 System.out.println(" Bule slider =815");
		 Thread.sleep(1000);*/
		}}
		 
		/* WebElement nu=driver.findElement(By.xpath("//input[@type='number'"));
		 nu.sendKeys("820");
		 Thread.sleep(3000);
		 System.out.println("number 820");
		 
		/* JavascriptExecutor slideadjuster=(JavascriptExecutor)driver;
		 slideadjuster.executeScript("window.(0,600)");
		 System.out.println("820");*/
		 /*String sliderValue = sliderSection.getAttribute("value");
         if (sliderValue.equals("560")) {
             System.out.println("Step 6: Slider value validated successfully");
         } else {
             System.out.println("Step 6: Slider value validation failed");
         }

       
         String[] cptCodes = {"CPT-99091", "CPT-99453", "CPT-99454", "CPT-99474"};
         for (String cptCode : cptCodes) {
             WebElement checkbox = driver.findElement(By.xpath("//label[text()='" + cptCode + "']/preceding-sibling::input"));
             if (!checkbox.isSelected()) {
                 checkbox.click();
             }
         }
         System.out.println("Step 7: Selected CPT codes");

         
         WebElement reimbursementHeader = driver.findElement(By.xpath("//h2[contains(text(),'Total Recurring Reimbursement')]"));
         String reimbursementValue = reimbursementHeader.getText();
         if (reimbursementValue.contains("$110700")) {
             System.out.println("Step 8: Reimbursement value validated successfully");
         } else {
             System.out.println("Step 8: Reimbursement value validation failed");
         }

     } 
	catch (Exception e)
	{
        
         e.printStackTrace();
     } finally
	{
        
       // driver.quit();
         System.out.println("Automation script completed");
     }
 }}*/

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 /*WebElement slider = driver.findElement(By.xpath("//div[@class='MuiSlider-track css-10opxo5'"));
         Actions action = new Actions(driver);
         action.dragAndDropBy(slider, 820,0).perform();
		Thread.sleep(3000);*/
		
		
	


