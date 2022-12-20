package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "./Feature_File/Youtube.feature",
			glue= {"org.testing.StepDefination"},
				monochrome=true,
			//	plugin={"pretty","html:target/HtmlReports","json:target/JSONReports/reports.json","junit:target/JUnitReports/report.xml"}
			tags= {"@Umang_Bhai_I_want_project"})


public class Runner {

}
