package RicksApp;

import RicksApp.enums.Builder;
import RicksApp.enums.Type;
import RicksApp.enums.Wood;

public class InstrumentSpec
{
	private Builder builder;
	private String model;
	private Type type;
	private Wood backwood, topWood;

	public InstrumentSpec(Builder builder, String model, Type type, Wood backwood, Wood topWood)
	{
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backwood = backwood;
		this.topWood = topWood;
	}

	public Builder getBuilder()
	{
		return builder;
	}

	public String getModel()
	{
		return model;
	}

	public Type getType()
	{
		return type;
	}

	public Wood getBackwood()
	{
		return backwood;
	}

	public Wood getTopWood()
	{
		return topWood;
	}

	public boolean matches(InstrumentSpec otherSpec)
	{
		if (builder != otherSpec.builder)
			return false;
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
			return false;
		if (type != otherSpec.type)
			return false;
		if (backwood != otherSpec.backwood)
			return false;
		if (topWood != otherSpec.topWood)
			return false;
		return true;
	}
}
