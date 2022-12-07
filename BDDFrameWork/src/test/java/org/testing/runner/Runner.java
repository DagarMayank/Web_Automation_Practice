package org.testing.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "./FeatureFiles/YoutubeFrameWork.feature",
			glue= {"org.testing.StepDefinition"},
				monochrome=true,
//				plugin={"pretty","html:target/HtmlReports","json:target/JSONReports/reports.json","junit:target/JUnitReports/report.xml"},
				tags= {"@YoutubeFrameWork"})
public class Runner 
{   
	
}
