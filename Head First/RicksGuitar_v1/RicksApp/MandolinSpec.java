package RicksApp;

import RicksApp.enums.Builder;
import RicksApp.enums.Style;
import RicksApp.enums.Type;
import RicksApp.enums.Wood;

public class MandolinSpec extends InstrumentSpec
{
	Style style;
	public MandolinSpec(Builder builder, String model, 
			Type type, Wood backwood, Wood topWood,
			Style style)
	{
		super(builder, model, type, backwood, topWood);
		this.style = style;
	}
	
	public Style getStyle()
	{
		return style;
	}
	
	public boolean matches(InstrumentSpec otherSpec)
	{
		if(!super.matches(otherSpec))
				return false;
		if(!(otherSpec instanceof MandolinSpec))
			return false;
		
		MandolinSpec mandolinSpec = (MandolinSpec)otherSpec;
		if(style !=  mandolinSpec.style)
			return false;
		return true;
	}
}
