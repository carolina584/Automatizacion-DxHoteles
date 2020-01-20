package co.com.automatizacion.qvision.dxhotels.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import co.com.automatizacion.qvision.dxhotels.userinterfaces.HotelResultListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class LowerPrice implements Interaction{

	@Step("Lower Price")
	@Override
	public <T extends Actor> void performAs(T actor) {
	
		List<WebElement> priceList = HotelResultListPage.HOTEL_LIST.resolveFor(actor).findElements(By.className("rate-number"));
		String[] part = priceList.get(0).getText().split("\\$");
		int less=Integer.parseInt(part[1]);
		int position=0;
	    for (int i=1; i < priceList.size();i++){
	    	String[] parte2 = priceList.get(i).getText().split("\\$");
			if (Integer.parseInt(parte2[1]) <less) {
				less=Integer.parseInt(parte2[1]);
				position=i;
			}
	    	priceList.get(i).getText().trim();}
	    List<WebElement> bookItButtonList = HotelResultListPage.HOTEL_LIST.resolveFor(actor).findElements(By.className("dx-button-text")); 
	    bookItButtonList.get(position).click();
	 }
	
	public static LowerPrice theHotel() {
		return instrumented(LowerPrice.class);
	}
}
