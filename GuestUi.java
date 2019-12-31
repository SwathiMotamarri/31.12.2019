package ui;


import dao.GuestDaoImpl;
import entities.Guest;
import service.GuestServiceImpl;
import service.IGuestService;

import java.util.Collection;
import java.util.Set;

public class GuestUi 
{
private IGuestService service = new GuestServiceImpl(new GuestDaoImpl());

    public static void main(String[] args) 
    {
       GuestUi ui = new GuestUi();
        ui.runUi();
    }

    public void runUi() 
    {
        try {
            Guest g3 = new Guest(3, "Sekhar");
            Guest g2 = new Guest(2, "Sailaja");
            Guest g4 = new Guest(4, "Swathi");
            Guest g1 = new Guest(1, "Abhinaya");
            service.addGuest(g1);
            service.addGuest(g2);
            service.addGuest(g3);
            service.addGuest(g4);
            Guest fetched1 = service.findGuestById(1);
            Guest fetched2 = service.findGuestById(2);
            Guest fetched3 = service.findGuestById(3);
            Guest fetched4 = service.findGuestById(4);
            System.out.println(fetched1.getName());
            System.out.println(fetched2.getName());
            System.out.println(fetched3.getName());
            System.out.println(fetched4.getName());
            System.out.println("********printing all guests****");
            Set<Guest> guests = service.allGuests();
            print(guests);
            Set<Guest> guests1 = service.allGuestsInOrderById();
            print(guests);
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("something went wrong");
        }
        //catch(IncorrectIdException e)
        //{
        //	System.out.println("");
        //}
      }

    void print(Collection<Guest>guests){
        for (Guest g: guests){
            System.out.println(g.getName());
        }
    }
}