package RicksApp.Specs;

import RicksApp.enums.Builder;
import RicksApp.enums.Type;
import RicksApp.enums.Wood;

//public class GuitarSpec extends InstrumentSpec
//{
//	private int numStrings;
//
//	public GuitarSpec(Builder builder, String model,
//			Type type, Wood backwood, Wood topWood,
//			int numString)
//	{
//		super(builder, model, type, backwood, topWood);
//		this.numStrings = numString;
//	}
//
//	public int getNumStrings()
//	{
//		return numStrings;
//	}
//	
//	public boolean matches(InstrumentSpec otherSpec)
//	{
//		if(!super.matches(otherSpec))
//				return false;
//		if(!(otherSpec instanceof GuitarSpec))
//			return false;
//		
//		GuitarSpec guitarSpec = (GuitarSpec)otherSpec;
//		if(numStrings != guitarSpec.numStrings)
//			return false;
//		return true;
//	}
//}
