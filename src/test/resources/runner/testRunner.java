
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"src.test.java"},
        //tags = {"~@Ignore"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })

public class testRunner implements{

}
