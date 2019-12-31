package dao;

import entities.Guest;
import exceptions.GuestNotFoundException;
import util.GuestComparator;

import java.util.*;

import Mo.Employee;
import Mo.EmployeeComparator;

public class GuestDaoImpl implements IGuestDao 
{
    private Map<Integer, Guest> store = new HashMap<>();

    @Override
    public void addGuest(Guest g) 
    {
        store.put(g.getId(), g);
    }

    @Override
    public Guest findGuestById(int id) 
    {
    	Guest g = store.get(id);
        if (g == null) 
        {
            throw new GuestNotFoundException("Guest not found for id=" + id);
        }
        return g;
    }

    @Override
    public Set<Guest> allGuests() 
    {
        Collection<Guest> guests = store.values();
        Set<Guest> guestSet = new HashSet<>(guests);
        return guestSet;
    }
    
    public Set<Guest> allGuestsInOrderById()
    {
    		Collection<Guest> guests1 = store.values();
    		Comparator<Guest> comparator=new GuestComparator();
			Set<Guest> gSet = new TreeSet<>(comparator);
    		gSet.addAll(guests1);
    		System.out.print("Printing by Comparator\n");
    		return gSet;
    }
}
    		
 