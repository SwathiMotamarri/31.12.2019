package ui;

import dao.WalletDaoImpl;
import entities.Wallet;
import service.WalletServiceImpl;
import service.IWalletService;

import java.util.Collection;
import java.util.Set;

public class Walletui
{
    private IWalletService service = new WalletServiceImpl(new WalletDaoImpl());

    public static void main(String[] args) 
    {
        Walletui ui = new Walletui();
        ui.runUi();
    }

    public void runUi() 
    {
        try {
        	Wallet w1 = new Wallet("9032301002", "Swathi", 2000);
        	Wallet w2 = new Wallet("9441607400", "Sailaja", 2000);
            service.addWallets(w1);
            service.addWallets(w2);
            Wallet fetched1 = service.findAccountByMobNo("9032301002");
            Wallet fetched2 = service.findAccountByMobNo("9441607400");           
            System.out.println(fetched1.getName());
            System.out.println(fetched2.getName());
            System.out.println("********printing all WalletCustomers****");
            Set<Wallet> wallets = service.allWallets();
            print(wallets);
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("something went wrong");
        }
        //catch(IncorrectIdException e)
        //{
        //	System.out.println("");
        //}
      }

    void print(Collection<Wallet>wallets){
        for (Wallet w: wallets){
            System.out.println(w.getName());
        }
    }
}

