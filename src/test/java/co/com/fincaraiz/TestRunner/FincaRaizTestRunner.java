package co.com.fincaraiz.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/SearchProperty.feature",
				glue="co.com.fincaraiz.StepsDefinitions",
				snippets=SnippetType.CAMELCASE)
public class FincaRaizTestRunner {

}
