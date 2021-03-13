package RicksApp;

import java.util.Iterator;
import java.util.List;

import RicksApp.enums.Builder;
import RicksApp.enums.Type;
import RicksApp.enums.Wood;

public class GuitarTester
{
	public static void main(String[] args)
	{
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar guitar = new Guitar("", 0, Builder.COLLINGS, "Stratocastor", Type.ELECTRIC,
				Wood.MAPLE, Wood.CEDAR);
		
		List<Guitar> matchingGuitar = inventory.search(guitar);
		
		if(!matchingGuitar.isEmpty())
		{
			System.out.println("We found some guitar you like: ");
			for(Iterator<Guitar> i = matchingGuitar.iterator(); i.hasNext();)
			{
				Guitar temp = (Guitar)i.next();
				System.out.println("we have a " +
						temp.getBuilder() + " " + temp.getModel() + " " +
						temp.getType() + " guitar:\n  " + 
						temp.getBackwood() + " back and sides,\n  " + 
						temp.getTopWood() + " top.\n you can have it for only: " +
						temp.getPrice());
			}
		}
		else
			System.out.println("Sorry| we have nothing for you.");
	}
	private static void initializeInventory(Inventory inventory)
	{
		inventory.addGuitar("1234", 500.5, Builder.COLLINGS,
				"Stratocastor", Type.ELECTRIC, Wood.MAPLE, Wood.CEDAR);
		inventory.addGuitar("23456", 14632.5, Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, Wood.INDIA_WOOD, Wood.CEDAR);
		inventory.addGuitar("6542", 300.5, Builder.GIBSON,
				"Not model", Type.ELECTRIC, Wood.JAPENES, Wood.MAPLE);
		inventory.addGuitar("95412", 400.4, Builder.GIBSON,
				"Stratocastor", Type.ELECTRIC, Wood.INDIA_WOOD, Wood.INDIA_WOOD);
	}
}
