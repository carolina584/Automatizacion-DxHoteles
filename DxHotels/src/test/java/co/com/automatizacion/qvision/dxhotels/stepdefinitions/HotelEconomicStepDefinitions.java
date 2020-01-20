package co.com.automatizacion.qvision.dxhotels.stepdefinitions;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import java.util.List;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import co.com.automatizacion.qvision.dxhotels.models.DataToReserveModel;
import co.com.automatizacion.qvision.dxhotels.questions.ValidatePriceQuestion;
import co.com.automatizacion.qvision.dxhotels.tasks.SearchHotel;
import co.com.automatizacion.qvision.dxhotels.tasks.SelectTheHotel;
import co.com.automatizacion.qvision.dxhotels.userinterfaces.Homepage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class HotelEconomicStepDefinitions {

	@Managed(driver= "chrome")
	private WebDriver hisBrowser;

	private Actor user = Actor.named("Carolina");
	private Homepage page;
	
	
	@Before
	public void setUp() {
	
		user.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^the user enters the dx hotels application$")
	public void theUserEntersTheDxHotelsApplication() {
	   
		user.wasAbleTo(Open.browserOn(page));
	}

	@When("^the user selects the options$")
	public void theUserSelectsTheOptions(List<DataToReserveModel> data) {
	    
		
	   user.attemptsTo(SearchHotel.forReserve(data.get(0)));
	   System.out.println("funcionooo");
	}

	@And("^choose the cheapest hotel$")
	public void chooseTheCheapestHotel() {
	   
		user.attemptsTo(SelectTheHotel.withLowestCost());
		System.out.println("paso");
	   
	}

	@Then("^validate that the total price (\\d+) is correct$")
	public void validateThatTheTotalPriceIsCorrect(String total) {
		user.should(seeThat(ValidatePriceQuestion.BuscarHotel(),  containsString(total)));
		System.out.println("paso");
		
	}
}
