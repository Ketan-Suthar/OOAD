package RicksApp.enums;

public enum InstrumentType
{
	GUITAR, BANJO, DOBRO, FIDDLE, BASS;
	
	public String toString()
	{
		switch(this)
		{
			case GUITAR: return "Guitar";
			case BANJO: return "Banjo";
			case DOBRO: return "Dobro";
			case FIDDLE: return "Fiddle";
			case BASS: return "Bass";
			default: return "Unspecified";
		}
	}
}
