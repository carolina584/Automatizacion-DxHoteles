package co.com.automatizacion.qvision.dxhotels.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReservationPage {
	
	public static final Target TOTAL_TO_PAY_NOW= Target.the("Total to pay now").locatedBy("//h4[@class='total-price']");
}
