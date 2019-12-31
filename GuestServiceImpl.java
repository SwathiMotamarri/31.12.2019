package service;

import dao.IGuestDao;
import entities.Guest;
import exceptions.IncorrectGuestIdException;

import java.util.Set;


public class GuestServiceImpl implements IGuestService {

    private IGuestDao dao;

    public GuestServiceImpl(IGuestDao dao) {
        this.dao = dao;
    }

    @Override
    public void addGuest(Guest g) {
        dao.addGuest(g);
    }

    @Override
    public Guest findGuestById(int id) {
        if (id < 0) {
            throw new IncorrectGuestIdException("Id is incorrect");
        }
        Guest g = dao.findGuestById(id);
        return g;
    }

    @Override
    public Set<Guest> allGuests() {
        Set<Guest> guests = dao.allGuests();
        return guests;
    }

	@Override
	public Set<Guest> allGuestsInOrderById() 
	{
		Set<Guest> guests1 = dao.allGuestsInOrderById();
		return guests1;
	}
}
