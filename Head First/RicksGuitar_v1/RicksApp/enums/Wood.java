package RicksApp.enums;

public enum Wood {
	INDIA_WOOD, JAPENES, CEDAR, MAPLE;
	public String toString()
	{
		switch(this)
		{
			case INDIA_WOOD: return "Indian wood";
			case JAPENES: return "japanes";
			case CEDAR: return "Cedar";
			case MAPLE: return "Maple";
			default: return "";
		}
	}
}
