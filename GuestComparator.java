package util;

import java.util.Comparator;
import entities.Guest;

public class GuestComparator implements Comparator<Guest>
{
	@Override
	public int compare(Guest o1, Guest o2)
	{
	if(o1.getId()>o2.getId())
		return 1;
	if(o2.getId()>o1.getId())
		return -1;
	return 0;
	}
}
