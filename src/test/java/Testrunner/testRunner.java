package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions
	(
	    features = "./src/test/java/Feature",
	            glue = {"stepDefination" , "Utiliy"}
	)
	public class testRunner {
	


}