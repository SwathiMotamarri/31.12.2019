package dao;

import entities.Wallet;
import exceptions.AccountNotFoundException;

import java.util.*;
public class WalletDaoImpl implements IWalletDao 
{

    private Map<String, Wallet> store = new HashMap<>();

    @Override
    public void addWallets(Wallet w) {
        store.put(w.getMobNo(), w);
    }

    @Override
    public Wallet findAccountByMobNo(String MobNo) {
    	Wallet w = store.get(MobNo);
        if (w == null) {
            throw new AccountNotFoundException("Wallet Account not found for Mobile No=" +MobNo );
        }
        return w;
    }

   // public void transferamount(Wallet a, Wallet b, double amount)
    //{	
    	//Wallet fetched1 = service.w2.balance();
      	//  Wallet fetched2 = service.findAccountByMobNo("9441607400");  
    	//w2.balance = w2.balance - amount;
    	//w1.balance = w1.balance + amount;
		// if (this.balance==0)
		//{
	    // throw new ZeroBalanceException("Account has zero balance");
		//}
	   
	//}
	
    
    @Override
    public Set<Wallet> allWallets() {
        Collection<Wallet> wallets = store.values();
        Set<Wallet> WalletSet = new HashSet<>(wallets);
        return WalletSet;
    }
}
