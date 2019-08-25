package flipkart__automation;

import org.openqa.selenium.JavascriptExecutor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Login {
	

	public static WebElement element;

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
				
			   	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Priya\\flipkart_automation\\driver\\chromedriver.exe");
			    ChromeDriver driver = new ChromeDriver();
			    driver.get("https://www.flipkart.com");
			    driver.manage().window().maximize();
			     
		//-----------------Login--------------------//
			     
		        File myExcelFile = new File ("C:\\Users\\Public\\Documents\\Priya\\flipkart_automation\\data\\FLIPKART.xlsx"); 
		        File src=new File("C:\\Users\\Public\\Documents\\Priya\\flipkart_automation\\data\\FLIPKART.xlsx") ;
		        FileInputStream fis = new FileInputStream(src);
		        XSSFWorkbook wb = new XSSFWorkbook(fis);
		        XSSFSheet Sheet1 = wb.getSheetAt(1);
		        
		        element=driver.findElement(By.className("_1dBPDZ"));
		        String d=String.valueOf(Sheet1.getRow(1).getCell(2).getNumericCellValue());
		        element.sendKeys("6300145199");
		        element=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		        element.sendKeys(Sheet1.getRow(1).getCell(1).getStringCellValue());
		        driver.findElement(By.className("_7UHT_c")).click();
		     
		    
		//--------------------Search Camera---------------//
		    
		        driver.get("Sheet1.getRow(1).getCell(4).getStringCellValue()");
		        driver.findElement(By.name("q")).sendKeys("Camera" + Keys.ENTER);
		  
		        Thread.sleep(2000);
		        
		        
		//------------------SCROLL---------------------------//   
		  
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,1000)", "");
		   
		        driver.get(Sheet1.getRow(1).getCell(3).getStringCellValue());
		        
		//-----------------ASSERT------------//
		    //WebElement element1=driver.findElement(By.className("_1vC4OE"));
		    //System.out.println(element1.getText());
		    
		        Thread.sleep(2000);
		        Actions action = new Actions(driver);
		  
		    
		//---------------add to cart-----------//
		        driver.findElementByClassName("_2MWPVK").click();
		        //WebElement element2=driver.findElement(By.className("XU9vZa"));
		    
		//---------------------validation for checkout and search screen-------------//
		        //Assert.assertEquals(element1.getText(), element2.getText());
		    
		    
		        driver.findElementByClassName("_7UHT_c").click();
		        driver.findElement(By.xpath("/div/div[2]/div/div[1]/div[1]/div/div/div/div[1]/div[1]/div/div[3]/a/span"));
		 
	


	}

}
