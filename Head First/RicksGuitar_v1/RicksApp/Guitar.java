package RicksApp;

import RicksApp.enums.Builder;
import RicksApp.enums.Type;
import RicksApp.enums.Wood;

public class Guitar
{
	String serialNumber;
	double price;
	GuitarSpec spec;
	
	public Guitar(String serialNumber, double price, Builder builder,
			String model, Type type, Wood backwood,
			Wood topWood, int numString) {
		spec = new GuitarSpec(builder, model, type, backwood, topWood, numString);
		this.serialNumber = serialNumber;
		this.price = price;
	}
	public GuitarSpec getSpec() {
		return spec;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
