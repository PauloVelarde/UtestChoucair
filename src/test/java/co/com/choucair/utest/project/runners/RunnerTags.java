package co.com.choucair.utest.project.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/choucairUtest.feature",
        tags="@scenario1",
        glue="co.com.choucair.utest.project.stepdefinitions",
        snippets=SnippetType.CAMELCASE)

public class RunnerTags  {


}
