package RicksApp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory
{
	private List<Instrument> inventory;

	public Inventory()
	{
		this.inventory = new LinkedList<>();
	}

	public void addInstrument(String serialNumber, double price,
			InstrumentSpec spec)
	{
		Instrument instrument = null;
		if(spec instanceof GuitarSpec)
			instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
		else if(spec instanceof MandolinSpec)
			instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);
		if(instrument != null)
			inventory.add(instrument);
	}

	public Instrument get(String serialNumber)
	{
		for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();)
		{
			Instrument instrument = (Instrument)i.next();
			if (instrument.getSerialNumber().equals(serialNumber))
				return instrument;
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec searchSpec)
	{
		List<Instrument> matchingGuitars = new LinkedList<>();
		for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();)
		{
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSpec().matches(searchSpec))
				matchingGuitars.add(instrument);
		}
		return matchingGuitars;
	}
	
//	public List<Instrument> search(MandolinSpec searchSpec)
//	{
//		List<Instrument> matchingMandolins = new LinkedList<>();
//		for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();)
//		{
//			Mandolin guitar = (Mandolin) i.next();
//			if (guitar.getSpec().matches(searchSpec))
//				matchingMandolins.add(guitar);
//		}
//		return matchingMandolins;
//	}
}
