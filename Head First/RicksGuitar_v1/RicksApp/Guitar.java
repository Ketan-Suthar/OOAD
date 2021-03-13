package RicksApp;

import RicksApp.enums.Builder;
import RicksApp.enums.Type;
import RicksApp.enums.Wood;

public class Guitar
{
	String serialNumber;
	double price;
	Builder builder;
	String model;
	Type type;
	Wood backwood, topWood;
	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backwood,
			Wood topWood) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backwood = backwood;
		this.topWood = topWood;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackwood() {
		return backwood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
