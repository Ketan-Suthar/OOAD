package RicksApp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import RicksApp.enums.Builder;
import RicksApp.enums.Type;
import RicksApp.enums.Wood;

public class Inventory
{
	private List<Guitar> guitars;

	public Inventory()
	{
		this.guitars = new LinkedList<>();
	}
	
	public void addGuitar(String serialNumber, double price, Builder builder,
			String model, Type type, Wood backwood,
			Wood topWood, int numString)
	{
		Guitar guitar = new Guitar(serialNumber, price, builder,
				model, type, backwood, topWood, numString);
		
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber)
	{
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();)
		{
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSerialNumber().equals(serialNumber))
				return guitar;
		}
		return null;
	}
	
	public List<Guitar> search(GuitarSpec searchSpec)
	{
		List<Guitar> matchingGuitars = new LinkedList<>();
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();)
		{
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSpec().matches(searchSpec))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}
