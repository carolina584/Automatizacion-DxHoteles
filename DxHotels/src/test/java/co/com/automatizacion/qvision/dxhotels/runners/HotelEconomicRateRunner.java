package co.com.automatizacion.qvision.dxhotels.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue="co.com.automatizacion.qvision.dxhotels.stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class HotelEconomicRateRunner {

}
