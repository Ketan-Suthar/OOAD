package RicksApp.enums;

public enum Style
{
	A,F,D,E;
	public String toString()
	{
		switch(this)
		{
			case A: return "a";
			case F: return "f";
			case D: return "d";
			case E: return "e";
			default: return "";
		}
	}
}
