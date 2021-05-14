package Utiliy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Basepage {

	public static WebDriver driver;
    
	@Before
	public void webBroswer() 
	{
    //System.setProperty("webdriver.chrome.driver","C:\\Users\\SravaniJagarlamudi\\SDET\\BDD\\chromedriver.exe");
     driver= new ChromeDriver();
      System.out.println("Broswer is opened");
	 }
   

}
