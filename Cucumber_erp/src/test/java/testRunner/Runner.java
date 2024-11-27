package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles/Customer.feature"},glue= {"stepDefiniation"},plugin= {"pretty","html:target/Cucumber/cucumber-reports"},monochrome=true,tags= {"@Customer"})
public class Runner {

}
