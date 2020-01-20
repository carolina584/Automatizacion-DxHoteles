package co.com.automatizacion.qvision.dxhotels.models;

public class DataToReserveModel {
	

	private String location = "";
	private String checkIn = "";
	private String checkOut = "";
	private String total= "";
	
	public DataToReserveModel(String location, String checkIn, String checkOut, String total) {
		this.location = location;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.total = total;
		
	}
	
    public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
}
