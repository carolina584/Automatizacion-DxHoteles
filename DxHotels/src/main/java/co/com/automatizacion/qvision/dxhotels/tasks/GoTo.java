package co.com.automatizacion.qvision.dxhotels.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class GoTo implements Task{

	PageObject page;
	
	public GoTo(PageObject page) {
		
	}
	@Step("GoTo Page Dx")
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Open.browserOn(page));
	}
	public static GoTo at(PageObject page) {
		return instrumented(GoTo.class);		
	}
}
