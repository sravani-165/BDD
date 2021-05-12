package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utiliy.Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination {
	WebDriver driver =Basepage.driver;
	@Given("login the application")
	public void login_the_application() {
		 driver.get("https://www.google.com/");
		   	}
	@Given("User is on google page")
	public void user_is_on_google_page() { 
	    
	    String title= driver.getTitle();
	    System.out.println(title);
	}

	@When("User search for facebook")
	public void user_search_for_facebook() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Facebook");
		
	}

	@When("Click on the search button")
	public void click_on_the_search_button() {
		driver.findElement(By.xpath("(//input[@type ='submit'])[3]")).click();
		
	}

	@Then("Results will display")
	public void results_will_display() {
		 String title= driver.getTitle();
		    System.out.println(title);
	}

}
