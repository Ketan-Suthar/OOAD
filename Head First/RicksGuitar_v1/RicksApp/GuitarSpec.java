package RicksApp;

import RicksApp.enums.Builder;
import RicksApp.enums.Type;
import RicksApp.enums.Wood;

public class GuitarSpec
{
	private Builder builder;
	private String model;
	private Type type;
	private Wood backwood, topWood;
	private int numStrings;
	
	
	public GuitarSpec(Builder builder, String model, Type type,
			Wood backwood, Wood topWood, int numString) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backwood = backwood;
		this.topWood = topWood;
		this.numStrings = numString;
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
	public int getNumStrings() {
		return numStrings;
	}
	public boolean matches(GuitarSpec otherSpec) {
		if(builder != otherSpec.builder)
			return false;
		if((model != null) && (!model.equals("")) &&
				(!model.equals(otherSpec.model)))
			return false;
		if(type != otherSpec.type)
			return false;
		if(numStrings != otherSpec.numStrings)
			return false;
		if(backwood != otherSpec.backwood)
			return false;
		if(topWood != otherSpec.topWood)
			return false;
		return true;
	}
}
