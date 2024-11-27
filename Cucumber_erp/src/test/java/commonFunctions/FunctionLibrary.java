package commonFunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FunctionLibrary {
	public static WebDriver driver;
	public static void startBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void openUrl(String Url)
	{
	driver.get(Url);	
	}
	public static void WaitForElement(String Locator_Type,String Locator_Value,String Test_Data)
	{
		WebDriverWait mywait=new WebDriverWait(driver, Integer.parseInt(Test_Data));
		if(Locator_Type.equalsIgnoreCase("xpath"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator_Value)));
		}
		else if(Locator_Type.equalsIgnoreCase("id"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Locator_Value)));
		}
		else if(Locator_Type.equalsIgnoreCase("name"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Locator_Value)));
		}
		
		
		
	}
	//method for text boxes
	public static void typeAction(String Locator_Type,String Locator_Value,String Test_Data)
	{
		if(Locator_Type.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Locator_Value)).clear();
			driver.findElement(By.xpath(Locator_Value)).sendKeys(Test_Data);
		}
		else if(Locator_Type.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(Locator_Value)).clear();
			driver.findElement(By.id(Locator_Value)).sendKeys(Test_Data);
		} 
		else if(Locator_Type.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(Locator_Value)).clear();
			driver.findElement(By.name(Locator_Value)).sendKeys(Test_Data);
		}
	}
	//method for radio boxes,images,hyperlinks,radiobuttons
	public static void clickAction(String Locator_Type,String Locator_Value)
	{
		if(Locator_Type.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Locator_Value)).click();
		}
		else if(Locator_Type.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(Locator_Value)).click();
		}
		else if(Locator_Type.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(Locator_Value)).click();
		}
	}
	//method for Validate Title
	public static void validateTitle(String Expected_Title)
	{
		String Actual_Title=driver.getTitle();
		try {
		Assert.assertEquals(Actual_Title, Expected_Title, "Title is Not Matching");
		}catch(AssertionError a)
		{
			System.out.println(a.getMessage());
		}
	}
	//method for close Browser
	public static void closeBrowser()
	{
		driver.quit();
	}
	
//method for date generation
	public static String generateDate()
	{
		Date date = new Date();
		DateFormat df=new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
		return df.format(date);
		
		
	}
	//method for List boxes
	public static void dropDownAction(String Locator_Type,String Locator_Value,String Test_Data)
	{
		if(Locator_Type.equalsIgnoreCase("xpath"))
		{
			Integer value=Integer.parseInt(Test_Data);
			WebElement element=driver.findElement(By.xpath(Locator_Value));
			Select select=new Select(element);
			select.selectByIndex(value);
		}
		else if(Locator_Type.equalsIgnoreCase("id"))
		{
			Integer value=Integer.parseInt(Test_Data);
			WebElement element=driver.findElement(By.id(Locator_Value));
			Select select=new Select(element);
			select.selectByIndex(value);
		}
		else if(Locator_Type.equalsIgnoreCase("name"))
		{
			Integer value=Integer.parseInt(Test_Data);
			WebElement element=driver.findElement(By.name(Locator_Value));
			Select select=new Select(element);
			select.selectByIndex(value);
		}
	}
	//method for capture Customer number 
	public static void captureCustomer(String Locator_Type,String Locator_Value) throws Throwable
	{
		String Customernum="";
		if(Locator_Type.equalsIgnoreCase("xpath"))
		{
			Customernum=driver.findElement(By.xpath(Locator_Value)).getAttribute("value");
			
		}
		else if(Locator_Type.equalsIgnoreCase("id"))
		{
			Customernum=driver.findElement(By.id(Locator_Value)).getAttribute("value");
		}
		else if(Locator_Type.equalsIgnoreCase("name"))
		{
			Customernum=driver.findElement(By.name(Locator_Value)).getAttribute("value");
		}
		//method for write Customer number into note pad
		FileWriter fw= new FileWriter("./CaptureData/Customernumber.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write(Customernum);
		bw.flush();
		bw.close();
	}
	//method for CustomerTable
	public static void customerTable() throws Throwable
	{
		FileReader fr= new FileReader("./CaptureData/Customernumber.txt");
		BufferedReader br=new BufferedReader(fr);
		String Exp_data=br.readLine();
		br.close();
		if(!driver.findElement(By.xpath("//input[@id='psearch']")).isDisplayed())
			driver.findElement(By.xpath("//span[@data-caption='Search']")).click();
		driver.findElement(By.xpath("//input[@id='psearch']")).clear();
		driver.findElement(By.xpath("//input[@id='psearch']")).sendKeys(Exp_data);
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
			String Act_Data=driver.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[5]/div/span/span")).getText();
			Thread.sleep(4000);
			try {
			Assert.assertEquals(Exp_data, Act_Data, "Customer number is not matching");
			}catch(AssertionError a)
			{
				System.out.println(a.getMessage());
			}
	}
}
