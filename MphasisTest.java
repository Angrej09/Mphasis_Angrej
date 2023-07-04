package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class MphasisTest {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.moneycorp.com/en-gb/");
	driver.manage().window().maximize();
	
		
	WebElement languageBtn=driver.findElement(By.xpath("//button[@id='language-dropdown-flag']"));
	languageBtn.click();
	Thread.sleep(1000);
	
	WebElement USABtn=driver.findElement(By.xpath("//*[text()='USA']"));
	USABtn.click();
	Thread.sleep(3000);
	
	String currentURL=driver.getCurrentUrl();
	System.out.println(currentURL);
	currentURL.contains("en-us");
	
	if(currentURL.contains("en-us"))
		System.out.println("WebPage is in USA English");
	else
		System.out.println("WebPage is not in USA English");
	
	
	WebElement searchBar=driver.findElement(By.xpath("//div[@class='u-flex u-flex-align-center u-flex-justify-end']//input[@name='q']"));
	searchBar.sendKeys("Foreign exchange solutions");;
	
	WebElement searchBtn=driver.findElement(By.xpath("//div[@class='u-flex u-flex-align-center u-flex-justify-end']//input[@type='submit']"));
	searchBtn.click();
	Thread.sleep(3000);
	
	WebElement results=driver.findElement(By.xpath("//a[contains(text(),'results')]"));
	String fx=results.getText();
	
	if(fx.contains("results"))
		System.out.println("FX is showing some results in webpage");
	else
		System.out.println("FX is not showing some results in webpage");
	
	WebElement searchBar1=driver.findElement(By.xpath("//div[@class='u-flex u-flex-align-center u-flex-justify-end']//input[@name='q']"));
	searchBar1.sendKeys("international payments");;
	
	WebElement searchBtn1=driver.findElement(By.xpath("//div[@class='u-flex u-flex-align-center u-flex-justify-end']//input[@type='submit']"));
	searchBtn1.click();
	Thread.sleep(3000);
	
	WebElement results1=driver.findElement(By.xpath("//a[contains(text(),'results')]"));
	String ip=results1.getText();
	
	if(ip.contains("results"))
		System.out.println("IP is showing some results in webpage");
	else
		System.out.println("IP is not showing some results in webpage");
	
	List<WebElement> searchLinklist=driver.findElements(By.xpath("//a[@class='title u-m-b2']"));
	
			for(WebElement links : searchLinklist) 
			{
				
				String searchlink = links.getAttribute("href");
				System.out.println(searchlink);
				if(searchlink.contains("en-us"))
					System.out.println("searchlinks is en us");
				else
					System.out.println("searchlinks is not en us");
			}
		
	driver.quit();
	
	}
}
