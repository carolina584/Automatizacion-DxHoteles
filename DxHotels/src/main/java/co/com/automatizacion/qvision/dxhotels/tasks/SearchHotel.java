package co.com.automatizacion.qvision.dxhotels.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import co.com.automatizacion.qvision.dxhotels.exceptions.HotelsPriceInquiryException;
import co.com.automatizacion.qvision.dxhotels.models.DataToReserveModel;
import co.com.automatizacion.qvision.dxhotels.userinterfaces.Homepage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class SearchHotel implements Task {

	private DataToReserveModel data;

	public SearchHotel(DataToReserveModel data) {
		this.data = data;}

	@Step("Search Hotel For Reserve")
	@Override
	public <T extends Actor> void performAs(T actor) {

		try {
			actor.attemptsTo(Click.on(Homepage.SELECT_LOCATION),
					Click.on(Homepage.TEXT_FIELD_LOCATION.of(data.getLocation())),
					Enter.theValue(data.getCheckIn()).into(Homepage.TEXT_FIELD_CHECKIN),
					WaitUntil.the(Homepage.TEXT_FIELD_CHECKOUT, isEnabled()), Click.on(Homepage.TEXT_FIELD_CHECKOUT),
					Enter.theValue(data.getCheckOut()).into(Homepage.TEXT_FIELD_CHECKOUT),
					Click.on(Homepage.BUTTON_SEARCH));
		} catch (Exception e) {
			throw new HotelsPriceInquiryException(HotelsPriceInquiryException.HOTE_INQUIRY_MESSAGE, e);
		}}

	public static SearchHotel forReserve(DataToReserveModel data) {
		return instrumented(SearchHotel.class, data);
	}}
