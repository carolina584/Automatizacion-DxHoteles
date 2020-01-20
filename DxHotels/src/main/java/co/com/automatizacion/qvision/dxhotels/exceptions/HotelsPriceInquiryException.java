package co.com.automatizacion.qvision.dxhotels.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class HotelsPriceInquiryException extends SerenityManagedException {

	/**
	 * 
	*/
	private static final long serialVersionUID = 1L;
	public static final String HOTE_INQUIRY_MESSAGE = "Failure To Check Hotel";

	public HotelsPriceInquiryException(String message, Throwable testErrorException) {
		super(message, testErrorException);
	}
}
