package DefaultPackage;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			
	        features = "src/test/resources/Features", strict=true, glue="LoginSteps",
	        	
	        plugin = {"pretty","html:target/HtmlReports"}
	        
	  )   
	public class LoginRunner {
		
	}
	