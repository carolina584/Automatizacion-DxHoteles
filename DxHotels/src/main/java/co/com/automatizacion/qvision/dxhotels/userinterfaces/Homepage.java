package co.com.automatizacion.qvision.dxhotels.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://js.devexpress.com/Demos/DXHotels/#home")
public class Homepage extends PageObject{
	
	public static final Target SELECT_LOCATION= Target.the("Select Location").locatedBy("(//input[@class='dx-texteditor-input'])[1]");
	public static final Target TEXT_FIELD_LOCATION= Target.the("Input text location").locatedBy("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'{0}')]");
	public static final Target TEXT_FIELD_CHECKIN= Target.the("Field Text CheckIn").locatedBy("(//input[@class='dx-texteditor-input'])[2]");
	public static final Target TEXT_FIELD_CHECKOUT= Target.the("Field Text CheckOut").locatedBy("(//input[@class='dx-texteditor-input'])[3]");
	public static final Target BUTTON_SEARCH= Target.the("Button Search").locatedBy("//span[@class='dx-button-text'][contains(text(),'SEARCH')]");

}
