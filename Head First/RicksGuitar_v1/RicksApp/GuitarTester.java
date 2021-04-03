package RicksApp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import RicksApp.Instruments.Instrument;
import RicksApp.Specs.InstrumentSpec;
import RicksApp.enums.Builder;
import RicksApp.enums.InstrumentType;
import RicksApp.enums.Type;
import RicksApp.enums.Wood;

public class GuitarTester
{
	public static void main(String[] args)
	{
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Map<String, Object> propeties = new HashMap<String, Object>();
//		propeties.put("builder", Builder.COLLINGS);
//		propeties.put("backWood", Wood.INDIA_WOOD);
		propeties.put("type", Type.ACOUSTIC);

		
		InstrumentSpec clientSpec = new InstrumentSpec(propeties);
		
		List<Instrument> matchingInstruments = inventory.search(clientSpec);
		
		if(!matchingInstruments.isEmpty())
		{
			System.out.println("We found some guitar you like: ");
			for(Iterator<Instrument> i = matchingInstruments.iterator(); i.hasNext();)
			{
				Instrument temp = (Instrument)i.next();
				InstrumentSpec spec = (InstrumentSpec)temp.getSpec();
				
				System.out.println("\nwe have a " +
						spec.getProperty("instrumentType") + " with following propeties");
				for(Iterator<?> j = spec.getProperties().keySet().iterator(); j.hasNext();)
				{
					String propertyName = (String)j.next();
					if(propertyName.equals("instruentType"))
						continue;
					System.out.println("   " + propertyName + ": " + spec.getProperty(propertyName));
				}
				
				System.out.println("\nyou can have it for only: " +
						temp.getPrice());
			}
		}
		else
			System.out.println("Sorry| we have nothing for you.");
	}
	private static void initializeInventory(Inventory inventory)
	{
		Map<String, Object> propeties = new HashMap<String, Object>();
		propeties.put("instrumentType", InstrumentType.BANJO);
		propeties.put("builder", Builder.COLLINGS);
		propeties.put("model", "CJ");
		propeties.put("type", Type.ACOUSTIC);
		propeties.put("numString", 6);
		propeties.put("topWood", Wood.CEDAR);
		propeties.put("backWood", Wood.INDIA_WOOD);
		inventory.addInstrument("11232", 3987.13, new InstrumentSpec(propeties));
		
		propeties.put("topWood", Wood.JAPENES);
		propeties.put("backWood", Wood.MAPLE);
		propeties.put("builder", Builder.MARTIN);
		propeties.put("model", "D-18");
		propeties.put("type", Type.ELECTRIC);
		inventory.addInstrument("11254", 651.5, new InstrumentSpec(propeties));
		

		propeties.put("backWood", Wood.JAPENES);
		propeties.put("topWood", Wood.MAPLE);
		propeties.put("builder", Builder.OLSON);
		propeties.put("model", "Stratocastor");
		propeties.put("type", Type.ACOUSTIC);
		inventory.addInstrument("1187", 987.9, new InstrumentSpec(propeties));
	}
}
