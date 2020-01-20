package co.com.automatizacion.qvision.dxhotels.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.automatizacion.qvision.dxhotels.interactions.LowerPrice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class SelectTheHotel implements Task{

	
	@Step("Select The Hotel With Lowest Cost")
	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(LowerPrice.theHotel());
	}
	public static SelectTheHotel withLowestCost() {
		return instrumented(SelectTheHotel.class);		
	}
}
