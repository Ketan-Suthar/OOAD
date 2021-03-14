package RicksApp;

import java.util.Iterator;
import java.util.List;

import RicksApp.Instruments.Guitar;
import RicksApp.Instruments.Instrument;
import RicksApp.Specs.GuitarSpec;
import RicksApp.Specs.InstrumentSpec;
import RicksApp.enums.Builder;
import RicksApp.enums.Type;
import RicksApp.enums.Wood;

public class GuitarTester
{
	public static void main(String[] args)
	{
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		InstrumentSpec clientsChoice = new GuitarSpec(Builder.COLLINGS, "Stratocastor", Type.ELECTRIC,
				Wood.MAPLE, Wood.CEDAR, 12);
		
		List<Instrument> matchingGuitar = inventory.search((GuitarSpec)clientsChoice);
		
		if(!matchingGuitar.isEmpty())
		{
			System.out.println("We found some guitar you like: ");
			for(Iterator<Instrument> i = matchingGuitar.iterator(); i.hasNext();)
			{
				Guitar temp = (Guitar)i.next();
				GuitarSpec spec = (GuitarSpec)temp.getSpec();
				System.out.println("we have a " +
						spec.getBuilder() + " " + spec.getModel() + " " +
						spec.getType() + " " + spec.getNumStrings() + "-string" 
						+ " guitar:\n  " + 
						spec.getBackwood() + " back and sides,\n  " + 
						spec.getTopWood() + " top.\n you can have it for only: " +
						temp.getPrice());
			}
		}
		else
			System.out.println("Sorry| we have nothing for you.");
	}
	private static void initializeInventory(Inventory inventory)
	{
		InstrumentSpec spec = new GuitarSpec( Builder.COLLINGS,
				"Stratocastor", Type.ELECTRIC, Wood.MAPLE, Wood.CEDAR, 12);
		inventory.addInstrument("1234", 500.5, spec);
		
		spec = new GuitarSpec( Builder.COLLINGS,
				"Stratocastor", Type.ELECTRIC, Wood.MAPLE, Wood.CEDAR, 12);
		inventory.addInstrument("1234", 145.5, spec);
		
		spec = new GuitarSpec( Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, Wood.INDIA_WOOD, Wood.CEDAR, 11);
		inventory.addInstrument("23456", 14632.5, spec);
		
		spec = new GuitarSpec( Builder.GIBSON,
				"Not model", Type.ELECTRIC, Wood.JAPENES, Wood.MAPLE, 12);
		inventory.addInstrument("6542", 300.5, spec);
		
		spec = new GuitarSpec( Builder.GIBSON,
				"Stratocastor", Type.ELECTRIC, Wood.INDIA_WOOD, Wood.INDIA_WOOD, 3);
		inventory.addInstrument("95412", 400.4, spec);
	}
}
