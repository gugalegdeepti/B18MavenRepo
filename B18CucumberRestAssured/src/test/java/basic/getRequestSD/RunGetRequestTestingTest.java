package basic.getRequestSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/basic/getRequestFF/GetRequestTesting.feature"},
		glue = {"basic/getRequestSD/"}
		)


public class RunGetRequestTestingTest {

}
