package Vtigerall;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Campaign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.vtiger.com/vtigercrm/");
		 driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		 driver.findElement(By.xpath("(//div[@class='row app-navigator'])[1]")).click();
		 driver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
		 driver.findElement(By.xpath("//span[text()=' Campaigns']")).click();
		 driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		 driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("Laptop");
		 
		 
		 WebElement la = driver.findElement(By.name("assigned_user_id"));
		Select l1=new Select(la);
		   l1.selectByValue("1");

		   WebElement la1 = driver.findElement(By.name("campaignstatus"));
		Select l11=new Select(la1);
		   l11.selectByValue("Planning");
		 
		   WebElement la2 = driver.findElement(By.name("campaigntype"));
		Select l12=new Select(la2);
		   l12.selectByValue("Trade Show");
		   
		   driver.findElement(By.id("Campaigns_editView_fieldName_product_id_create")).click();
		   driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("Software");
		   driver.findElement(By.name("saveButton")).click();
		   driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).sendKeys("24-04-2023");
		   driver.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("59976560");
		   driver.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("49");
		   driver.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys("Mr.Patil");
		   driver.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("45");
		   driver.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("5956000");
		   driver.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("55670");
		   WebElement la4 = driver.findElement(By.name("expectedresponse"));
		   Select l14=new Select(la4);
		   l14.selectByValue("Good");
		   driver.findElement(By.id("Campaigns_editView_fieldName_actualcost")).sendKeys("400000");
		   driver.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("43556");
			 driver.findElement(By.id("Campaigns_editView_fieldName_actualsalescount")).sendKeys("34343");
			 driver.findElement(By.id("Campaigns_editView_fieldName_expectedrevenue")).sendKeys("32454");
			 driver.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("3654");
			 driver.findElement(By.id("Campaigns_editView_fieldName_actualresponsecount")).sendKeys("568");
			 driver.findElement(By.id("Campaigns_editView_fieldName_expectedroi")).sendKeys("561323");
			 driver.findElement(By.id("Campaigns_editView_fieldName_actualroi")).sendKeys("35577");
			 driver.findElement(By.id("Campaigns_editView_fieldName_description")).sendKeys("bcnthcjmzd,kgtyoijiyuf;ltyoy/rpy/");
			 driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
			 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();

			   
	}

}
