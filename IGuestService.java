package service;

import entities.Guest;
import java.util.Set;

public interface IGuestService 
{
    void addGuest(Guest e);

    Guest findGuestById(int id);

    Set<Guest> allGuests();

	Set<Guest> allGuestsInOrderById();
}
