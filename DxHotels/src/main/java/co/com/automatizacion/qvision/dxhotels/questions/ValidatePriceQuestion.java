package co.com.automatizacion.qvision.dxhotels.questions;

import static co.com.automatizacion.qvision.dxhotels.userinterfaces.ReservationPage.TOTAL_TO_PAY_NOW;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class ValidatePriceQuestion implements Question<String> {

	private String total;
	
	@Step("Validate Price")
	@Override
	public String answeredBy(Actor actor) {

		total = Text.of(TOTAL_TO_PAY_NOW).viewedBy(actor).asString();
		System.out.println(total);
		return Text.of(TOTAL_TO_PAY_NOW).viewedBy(actor).asString();

	}

	public static ValidatePriceQuestion BuscarHotel() {
		return new ValidatePriceQuestion();
	}
}
