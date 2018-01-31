package featurefiles;

import com.homepage.homePage;

import cucumber.api.CucumberOptions;


@CucumberOptions(features = "featurefiles//homepage.feature", //tags={"@@APIendpointStatus"},
glue={"StpDefinition"},monochrome = true
)

//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
/*public class RunCukesTest {
}*/
public class chukes extends homePage{

	
}
