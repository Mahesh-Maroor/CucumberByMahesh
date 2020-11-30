package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\Mahesh Maroor\\workspace\\September\\Mahesh\\src\\main\\java\\FeatureFiles\\BackgroundCheck.feature"},
                  glue="StepDef",
                  monochrome=true,			
                  dryRun=false,
                  strict=true,
                  plugin={"pretty","html:Html_test-output","json:jsonOP\\CucumberJSON","junit:junitXml\\XmlRes"}
                  ,tags="@SmokeTest"
                   
		)
public class TestRunner 
{

}
